/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.rmi.*;
/**
 *
 * @author AHDDAD
 */
public interface BoardRemote extends Remote {
    
    void update(int oldX, int onldY, int currentX, int currentY) throws RemoteException;
    void addStudent(CourseBoardStudentInterface courseBoardStudentInterface) throws RemoteException;
    
}
