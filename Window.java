package windowsdemo;

import java.awt.Color;
import java.util.Random;

public class Window implements Comparable<Window> {

    private int x;
    private int y;
    private int W;
    private int H;
    private int zOrder;
    private Color color;

    public Window(int x, int y, int W, int H, int zOrder, Color color) {
        this.x = x;
        this.y = y;
        this.W = W;
        this.H = H;
        this.zOrder = zOrder;
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setW(int W) {
        this.W = W;
    }

    public void setH(int H) {
        this.H = H;
    }

    public void setZOrder(int zOrder) {
        this.zOrder = zOrder;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getW() {
        return W;
    }

    public int getH() {
        return H;
    }

    public int getZOrder() {
        return zOrder;
    }
    
    public Color getColor() {
        return color;
    }

    @Override
    public int compareTo(Window o) {
        return this.zOrder - o.zOrder;
    }
}



