package windowsdemo;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class WindowManager {

    public ArrayList<Window> windows;

    public WindowManager() {
        windows = new ArrayList<Window>();
    }

    public ArrayList<Window> getWindows() {
        return windows;
    }

    public int getNumberOfWindows() {
        return windows.size();
    }

    public void addWindow(int x, int y, int W, int H, int zOrder, Color color) {
        Window newWindow = new Window(x, y, W, H, zOrder, color);
        windows.add(newWindow);
    }

    public void drawWindow() {

    }

    public void bringToFront() {

    }

    public void findWindowByPosition() {

    }
}





