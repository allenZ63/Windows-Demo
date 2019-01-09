package windowsdemo;

import java.awt.*;
import javax.swing.*;

public class WindowsDemo {
    
    public static final int sizeX = 1200; //frame size
    public static final int sizeY = 600;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(sizeX, sizeY);
        frame.setLocationRelativeTo(null);
        MyJPanel panel = new MyJPanel();
        panel.setBackground(Color.black);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}








