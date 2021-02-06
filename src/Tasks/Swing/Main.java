package Tasks.Swing;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // создаем окно
        JFrame jf = new JFrame();
        // устанавливаем ему размеры
        jf.setSize(400, 300);
        // и показываем его
        jf.addMouseListener(new SimpleClickListener());
        jf.setVisible(true);
    }
}
