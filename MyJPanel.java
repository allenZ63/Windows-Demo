package windowsdemo;

import java.util.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class MyJPanel extends JPanel implements MouseListener {

    volatile private boolean mouseDown = false;
    private WindowManager manage;
    private Random randomNumber = new Random();
    private int num = 10; //decides number of Windows

    public MyJPanel() {
        manage = new WindowManager();
        Random rand = new Random();

        for (int i = 0; i < num; i++) {
            int x = rand.nextInt(WindowsDemo.sizeX / 2) + WindowsDemo.sizeX / 4;
            int y = rand.nextInt(WindowsDemo.sizeY / 3) + WindowsDemo.sizeY / 4;
            int W = rand.nextInt(100) + 50;
            int H = rand.nextInt(100) + 50;
            int zOrder = i;
            Color color = getRandomColor();
            manage.addWindow(x, y, W, H, zOrder, color);
        }
        this.addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Collections.sort(manage.getWindows());
        //  for(int i=0;i<num;i++){
        //     System.out.println(manage.windows.get(i).getZOrder());
        // }
        for (int i = 0; i < manage.getNumberOfWindows(); i++) {
            g.setColor(manage.windows.get(i).getColor());
            g.fillRect(manage.windows.get(i).getX(), manage.windows.get(i).getY(), manage.windows.get(i).getW(), manage.windows.get(i).getH());
        }
    }

    private Color getRandomColor() {
        return new Color(randomNumber.nextFloat(),
                randomNumber.nextFloat(), randomNumber.nextFloat());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            mouseDown = true;
            for (int i = 0; i < manage.getNumberOfWindows(); i++) {
                Window w = manage.windows.get(i);
                if (e.getX() > w.getX() && e.getX() < w.getX() + w.getW() && e.getY() > w.getY() && e.getY() < w.getY() + w.getH()) {
                    //0- i-i windows , zorder = zorder +1
                    //ith -> 0
                    for (int j = i + 1; j < num; j++) {
                        manage.getWindows().get(j).setZOrder(manage.getWindows().get(j).getZOrder() - 1);
                    }
                    manage.getWindows().get(i).setZOrder(num - 1);
                    break;
                }
            }
        }
        this.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            mouseDown = false;
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



