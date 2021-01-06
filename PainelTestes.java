/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes.gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

/**
 *
 * @author creuma
 */
public class PainelTestes extends JPanel implements Runnable  {
    
    AffineTransform atf = new AffineTransform();
    
    @Override
    public void paintComponent(Graphics g){

       super.paintComponent(g);
       Graphics2D g2d = (Graphics2D) g;
       this.setBackground(new Color(255,255,255));
       
       // Anti-Aliasing
       g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       g2d.setPaint(new GradientPaint(0,0, Color.YELLOW,61,63, Color.RED,true));
       g2d.fill(new Ellipse2D.Double(270, 120, 100, 100));
      
       // Detalhes da linha amarela
       atf= g2d.getTransform(); 
       
       g2d.rotate(40,410,110);
       g2d.setPaint(Color.orange);
       g2d.fillRoundRect(415,120, 30, 10,7,7);
        
       g2d.setPaint(Color.ORANGE);
       g2d.fillRoundRect(375,120, 30, 10,7,7);
       
       g2d.setPaint(Color.ORANGE);
       g2d.fillRoundRect(335,120, 30, 10,7,7);
       
       g2d.setTransform(atf);
       
       // Detalhes da linha antes da Linha amarela
       g2d.rotate(40,410,90);
       g2d.setPaint(new GradientPaint(0,0, Color.YELLOW,50,63, Color.RED,true));
       g2d.fillRoundRect(430,130, 30, 10,7,7);
        
       g2d.setPaint(new GradientPaint(0,0, Color.YELLOW,50,63, Color.RED,true));
       g2d.fillRoundRect(390,130, 30, 10,7,7);
       
       g2d.setTransform(atf);
       
       //Detalhes da linha depois da linha amarela
       g2d.setPaint(new GradientPaint(0,0, Color.YELLOW,50,63, Color.RED,true));
       g2d.fillRoundRect(405,155, 30, 10,7,7);
       
       g2d.setPaint(new GradientPaint(0,0, Color.YELLOW,50,70, Color.RED,true));
       g2d.fillRoundRect(445,155, 30, 10,7,7);
        
       g2d.setPaint(new GradientPaint(0,50, Color.red,40,55, Color.YELLOW,true));
       g2d.fillRoundRect(485,155, 30, 10,7,7);

       g2d.setTransform(atf);
       
       g2d.rotate(55,305,105);
       g2d.setPaint(Color.RED);
       g2d.fillRoundRect(345,105, 30, 10,7,7);
       
       g2d.setPaint(Color.RED);
       //g2d.setPaint(Color.BLACK);
       g2d.fillRoundRect(305,105, 30, 10,7,7);
       
       g2d.setTransform(atf);

     
    
    }

    
    
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
