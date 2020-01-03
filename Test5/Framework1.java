import javax.swing.*;
import java.awt.*;

public class Framework1 extends JFrame {
    private static void window() {
        JFrame f= new JFrame("GUI Demo");
        f.setSize(400,200);

        JPanel panel=new JPanel();
        panel.setLocation(400,300);
        panel.setSize(500,350);
        panel.setLocation(8,8);
        panel.setLayout(new GridLayout(2,3));
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 5"));
        panel.add(new JButton("Button 6"));
        f.add(panel);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Framework1::window);
    }
}
