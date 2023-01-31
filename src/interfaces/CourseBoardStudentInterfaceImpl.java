/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import GUI.DrawArea;
import entities.Student;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AHDDAD
 */
public class CourseBoardStudentInterfaceImpl implements CourseBoardStudentInterface, Serializable{


    public BoardRemote boardRemote;
    DrawArea drawArea ;

    public CourseBoardStudentInterfaceImpl(BoardRemote boardRemote, DrawArea drawArea) throws RemoteException {
        this.boardRemote = boardRemote;
        this.drawArea = drawArea;
        System.out.println(this.drawArea.g2 == null);
        this.boardRemote.addStudent(this);
    }
    
    
    
    @Override
    public void draw(int oldX, int oldY, int currentX, int currentY) {
        
        
        if(this.drawArea.g2 != null){
            this.drawArea.g2.drawLine(oldX, oldY, currentX, currentY);
        }else{
            System.out.println("g2 null student");
        }
        
        
        this.drawArea.repaint();
    }
    
    
    
}
