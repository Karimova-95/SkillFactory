package Tasks.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;

public class MyFirstApp {

    public static void main(String[] args) {
        JFrame jFrame = getFrame();

//        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        jFrame.add(new MyComponent());
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
//            g2.draw(el);
//            g2.setPaint(new Color(12, 12, 12));
            g2.setPaint(Color.ORANGE);
            g2.fill(el);

            Rectangle2D r2 = new Rectangle2D.Double(45, 50, 110, 110);
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
        jf.setTitle("My first swing app");
        return  jf;
    }
}
