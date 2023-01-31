/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import GUI.DrawArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AHDDAD
 */
public class BoardInterfaceImpl extends Thread implements BoardInterface {

    public DrawArea drawArea;
    public BoardRemote boardRemote;

    public BoardInterfaceImpl(DrawArea drawArea, BoardRemote boardRemote) throws RemoteException {
        this.drawArea = drawArea;
        this.boardRemote = boardRemote;
    }

    @Override
    public void drawOn(DrawArea drawAra) {

        System.out.println("draw on starts ");

        drawAra.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                drawAra.setCurrentX(e.getX());
                drawAra.setCurrentY(e.getY());
                System.out.println("draw on starts ");
                if (drawArea.g2 != null) {
                    drawArea.g2.drawLine(drawAra.getOldX(), drawAra.getOldY(), drawAra.getCurrentX(), drawAra.getCurrentY());
                    try {
                        boardRemote.update(drawAra.getOldX(), drawAra.getOldY(), drawAra.getCurrentX(), drawAra.getCurrentY());
                    } catch (RemoteException ex) {
                        // handle
                    }
                    drawArea.repaint();
                    drawAra.setOldX(drawAra.getCurrentX());
                    drawAra.setOldY(drawAra.getCurrentY());
                } else {
                    System.out.println("g2 null coté teacher");
                }
            }

        });
    }

    @Override
    public void run() {
        drawOn(drawArea);
    }

}
