/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chaptar4;

/**
 *
 * @author Sadman Islam
 */
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel 
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        g.drawLine(0, 0, width, height);
        g.drawLine(0, height, width, 0);
    }
}

