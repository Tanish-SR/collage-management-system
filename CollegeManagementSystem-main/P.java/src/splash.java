
//package P;
import javax.swing.*;
import java.awt.*;

public class splash extends JFrame implements Runnable {
    Thread t;

    splash() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/BU.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        t = new Thread(this);
        t.start();

        setLocation(225, 50);
        setSize(1000, 800);
        setVisible(true);
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }

    }

    public void run() {
        try {
            Thread.sleep(7000);
            setVisible(false);
            new Login();
        } catch (Exception e) {

        }
    }

    public static void main(String args[]) {
        new splash();

    }
}
