package Servers;

import entities.Course;
import entities.Student;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;

public class Server {

    public static void main(String[] args) {
        try {
            
            
            DatagramSocket server = new DatagramSocket(4567);

            while (true) {
                // receive data
                byte[] receivedBytes = new byte[1024];
                DatagramPacket receivedPacket = new DatagramPacket(receivedBytes, receivedBytes.length);
                server.receive(receivedPacket);

                // print data
                String message = new String(receivedPacket.getData(), 0, receivedPacket.getLength());

                //extract infos
                String[] infos = message.split(",", 4);
                String sender = infos[0];
                String receiver = infos[1];
                String content = infos[2];
                String typeSender = infos[3];

                System.out.println("sender = " + sender);
                System.out.println("receiver = " + receiver);
                System.out.println("message : " + content);
                System.out.println("typeSender : " + typeSender);

                if (typeSender.equals("student")) {

                    // send message to course chat
                    int port = Integer.parseInt(Course.getCourseByLibelle(receiver).getPort());
                    String addr = Course.getCourseByLibelle(receiver).getAddress();
                    InetAddress inetAddress = InetAddress.getByName(addr);

                    byte[] bytesToSend = content.getBytes();
                    DatagramPacket packetToSend = new DatagramPacket(bytesToSend, bytesToSend.length, inetAddress, port + 1);
                    server.send(packetToSend);

                    // send message to other students
                    ArrayList<Student> students = Student.getStudentsByLevel(Course.getCourseByLibelle(receiver).getLevel());
                    for (Student student : students) {

                        if (student.getPort() != null && student.getAddress() != null && !student.getUsername().equals(sender)) {
                            port = Integer.parseInt(student.getPort());
                            addr = student.getAddress();
                            inetAddress = InetAddress.getByName(addr);
                            bytesToSend = content.getBytes();
                            packetToSend = new DatagramPacket(bytesToSend, bytesToSend.length, inetAddress, port + 1);
                            server.send(packetToSend);
                            System.out.println("message sent to "+student.getUsername() + " port : "+(port+1));
                        }

                    }
                } else {
                    // send message to other students
                    ArrayList<Student> students = Student.getStudentsByLevel(Course.getCourseByLibelle(sender).getLevel());
                    for (Student student : students) {

                        if (student.getPort() != null && student.getAddress() != null) {
                            int port = Integer.parseInt(student.getPort());
                            String addr = student.getAddress();
                            InetAddress inetAddress = InetAddress.getByName(addr);
                            byte[] bytesToSend = content.getBytes();
                            DatagramPacket packetToSend = new DatagramPacket(bytesToSend, bytesToSend.length, inetAddress, port + 1);
                            server.send(packetToSend);
                            System.out.println("message sent to "+student.getUsername() + " port : "+(port+1));
                        }

                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
