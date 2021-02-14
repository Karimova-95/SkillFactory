package Tasks.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.beans.EventHandler;
import java.net.MalformedURLException;
import java.net.URL;

public class MyFirstApp {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();
    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton(new MyAction());
        jButton.setText("submit");
        jPanel.add(jButton);
//        *********** WindowAdapter - имплементит только один метод, WindowListener - несколько
//        jFrame.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                super.windowClosing(e);
//            }
//        });
//        ********** Все типы кнопок
//        JButton jButton1 = new JButton("Metal");
//        JButton jButton2 = new JButton("Nimbus");
//        JButton jButton3 = new JButton("Motif");
//        JButton jButton4 = new JButton("Windows");
//        JButton jButton5 = new JButton("Windows Classic");
//        jPanel.add(jButton1);
//        jPanel.add(jButton2);
//        jPanel.add(jButton3);
//        jPanel.add(jButton4);
//        jPanel.add(jButton5);
//        jButton1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
//                } catch (Exception ex) {
//                    ex.printStackTrace();
//                }
//            }
//        });
//        jButton2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//                } catch (Exception ex) {
//                    ex.printStackTrace();
//                }
//            }
//        });
//        jButton3.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//                } catch (Exception ex) {
//                    ex.printStackTrace();
//                }
//            }
//        });
//        jButton4.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//                } catch (Exception ex) {
//                    ex.printStackTrace();
//                }
//            }
//        });
//        jButton5.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
//                } catch (Exception ex) {
//                    ex.printStackTrace();
//                }
//            }
//        });
//        JButton jButton = new JButton("submit");
//        jPanel.add(jButton);
//        jButton.addActionListener(EventHandler.create(ActionListener.class, jFrame, "title", "source.text"));
//        ********* Сверху 1 строчка и нижние 7строчек одно и то же.
//        jButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                jPanel.setBackground(Color.BLUE); //задний фон меняем
//                jFrame.setTitle(((JButton)e.getSource()).getText());
//            }
//        });

//        ********* Все шрифты
////        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
////        jFrame.add(new MyComponent());
//
//        ********* Стили кнопок
//        UIManager.LookAndFeelInfo[] lookAndFeelInfos = UIManager.getInstalledLookAndFeels();
//        for (UIManager.LookAndFeelInfo lookAndFeelInfo : lookAndFeelInfos) {
//            System.out.println(lookAndFeelInfo.getName());
//            System.out.println(lookAndFeelInfo.getClassName());
//        }

    }

    static class MyAction extends AbstractAction {

        MyAction() {
            //свойства для кнопки
            putValue(AbstractAction.SHORT_DESCRIPTION, "My small action");
        }
        @Override
        public void actionPerformed(ActionEvent e) {
           jPanel.setBackground(Color.orange);
        }
    }

    static class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font("Roboto", Font.ITALIC, 20);
            Graphics2D g2 = (Graphics2D) g;
            g2.setFont(font);
            g2.drawString("Hello world!", 50, 40);
            Point2D p1 = new Point2D.Double(50, 55);
            Point2D p2 = new Point2D.Double(150, 55);
//            Line2D l2 = new Line2D.Double(0, 52, 200, 52);
            Line2D l2 = new Line2D.Double(p1, p2);
            g2.draw(l2);
            Ellipse2D el = new Ellipse2D.Double(50, 55, 100, 100);
//            el.setFrameFromDiagonal(p1, p2);
//            g2.draw(el);
//            g2.setPaint(new Color(12, 12, 12));
            g2.setPaint(Color.ORANGE);
            g2.fill(el);

            Rectangle2D r2 = new Rectangle2D.Double(45, 50, 110, 110);
//            r2.setFrameFromDiagonal(p1, p2);
            g2.draw(r2);
            try {
                URL url = new URL("https://horo.mail.ru/img/horo/zodiac/180/9.png");
                Image image = new ImageIcon(url).getImage();
                g2.drawImage(image, 220, 50, null);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }

    static JFrame getFrame() {
        JFrame jf = new JFrame() {};
        jf.setVisible(true);
//        jf.setSize(500, 300);
//        jf.setLocation(450, 200);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jf.setBounds(dimension.width/2 - 250, dimension.height/2 - 150, 500, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jf.setTitle("My first swing app");
        return  jf;
    }
}
