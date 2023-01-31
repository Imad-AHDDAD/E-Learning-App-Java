/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author AHDDAD
 */
public class BoardRemoteImpl extends UnicastRemoteObject implements BoardRemote{

    ArrayList<CourseBoardStudentInterface> list;
    
    public BoardRemoteImpl() throws RemoteException{
        list = new ArrayList<>();
    }
    
    @Override
    public void update(int oldX, int onldY, int currentX, int currentY) throws RemoteException {
        System.out.println("size = "+list.size());
        for (int i = 0 ; i<list.size(); i++){
            list.get(i).draw(oldX, onldY, currentX, currentY);
        }
    }

    @Override
    public void addStudent(CourseBoardStudentInterface courseBoardStudentInterface) throws RemoteException {
        System.out.println("ajout d'un etudiant");
        list.add(courseBoardStudentInterface);
    }

    
}
