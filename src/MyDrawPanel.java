/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
import javax.swing.*;
import java.awt.*;
public class MyDrawPanel extends JPanel{
    Color A,B;
    public MyDrawPanel(Color C,Color D){
        A=C;
        B=D;
    }
    public void paintComponent(Graphics g){
        Graphics2D g2D=(Graphics2D) g;
        GradientPaint grad=new GradientPaint(0,0,A,this.getWidth(),this.getHeight(),B);
        g2D.setPaint(grad);
        g2D.fillRect(0,0,this.getWidth(),this.getHeight());
    }
    
}
