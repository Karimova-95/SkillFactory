package Tasks.Swing;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MyFrame extends JFrame {
    MyFrame() {
        setSize(400, 300);
        setVisible(true);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                setLocation(e.getXOnScreen() - getWidth()/2, e.getYOnScreen() - getHeight()/2);
            }
        });
    }
}

class MainApp {
    public static void main(String[] args) {
        new MyFrame();
    }
}
