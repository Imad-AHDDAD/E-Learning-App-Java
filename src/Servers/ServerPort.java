package Servers;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.sql.*;
import dbconnection.DBConnection;

public class ServerPort {

    public static void main(String[] args) {

        try {
            DatagramSocket server = new DatagramSocket(8888);

            while (true) {
                // receive data
                byte[] receivedBytes = new byte[1024];
                DatagramPacket receivedPacket = new DatagramPacket(receivedBytes, receivedBytes.length);
                server.receive(receivedPacket);

                String message = new String(receivedPacket.getData(), 0, receivedPacket.getLength());
                String port = Integer.toString(receivedPacket.getPort());
                String address = receivedPacket.getAddress().getHostAddress();

                //extract infos
                String[] infos = message.split(",", 2);
                String username = infos[0];
                String type = infos[1];

                // connect too database
                Connection connection = new DBConnection().getConnection();
                String sql = "";
                PreparedStatement preparedStatement;

                // s'il s'agit d'un etudiant
                if (type.equals("student")) {
                    sql = "UPDATE user SET address = ? , port = ? WHERE username = ?";
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, address);
                    preparedStatement.setString(2, port);
                    preparedStatement.setString(3, username);
                    int count = preparedStatement.executeUpdate();
                    if (count == 1) {
                        System.out.println(username + "updated");
                    } else {
                        System.out.println("failed to update " + username);
                    }
                } else {
                    sql = "UPDATE course SET address = ? , port = ? WHERE libelle = ?";
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, address);
                    preparedStatement.setString(2, port);
                    preparedStatement.setString(3, username);
                    int count = preparedStatement.executeUpdate();
                    if (count == 1) {
                        System.out.println(username + "updated");
                    } else {
                        System.out.println("failed to update " + username);
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
