/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chaptar9;

/**
 *
 * @author Sadman Islam
 */
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class LabelDemo {

    public static void main(String[] args) {
        JLabel northLabel = new JLabel("North");
        ImageIcon labelIcon = new ImageIcon(
                "C:\\Users\\Sadman Islam\\OneDrive\\Documents\\NetBeansProjects\\GUI\\src\\main\\java\\Chaptar9\\GUItip.gif");
        JLabel centerLabel = new JLabel(labelIcon);
        JLabel southLabel = new JLabel(labelIcon);
        southLabel.setText("South");

        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(northLabel, BorderLayout.NORTH);
        application.add(centerLabel, BorderLayout.CENTER);
        application.add(southLabel, BorderLayout.SOUTH);

        application.setSize(300, 300);
        application.setVisible(true);
    }
}
