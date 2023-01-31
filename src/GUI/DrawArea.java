/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.Serializable;
import javax.swing.JComponent;

/**
 *
 * @author AHDDAD
 */
public class DrawArea extends JComponent implements Serializable{

    // image where we are going to paint
    public Image image;
    // graphics2d object used to draw on
    public Graphics2D g2;
    // mouse coordinates
    private int currentX, currentY, oldX, oldY;

    public DrawArea() {
        setDoubleBuffered(false);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // save mouse coords when its pressed
                oldX = e.getX();
                oldY = e.getY();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (image == null) {
            image = createImage(getSize().width, getSize().height);
            g2 = (Graphics2D) image.getGraphics();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            clear();

        }
        
        g.drawImage(image, 0, 0, null);
    }
    
    // now we create exposed methods
    public void clear(){
        g2.setPaint(Color.white);
        g2.fillRect(0, 0, getSize().width, getSize().height);
        g2.setPaint(Color.black);
        repaint();
    }
    
    public void red(){
        g2.setPaint(Color.red);
    }
    
    public void blue(){
        g2.setPaint(Color.blue);
    }
    
    public void green(){
        g2.setPaint(Color.green);
    }
    
    public void black(){
        g2.setPaint(Color.black);
    }
    
    public void magenta(){
        g2.setPaint(Color.magenta);
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Graphics2D getG2() {
        return g2;
    }

    public void setG2(Graphics2D g2) {
        this.g2 = g2;
    }

    public int getCurrentX() {
        return currentX;
    }

    public void setCurrentX(int currentX) {
        this.currentX = currentX;
    }

    public int getCurrentY() {
        return currentY;
    }

    public void setCurrentY(int currentY) {
        this.currentY = currentY;
    }

    public int getOldX() {
        return oldX;
    }

    public void setOldX(int oldX) {
        this.oldX = oldX;
    }

    public int getOldY() {
        return oldY;
    }

    public void setOldY(int oldY) {
        this.oldY = oldY;
    }
    
    
    

}
