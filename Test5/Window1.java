import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Window1 extends JFrame implements MouseListener {
    public JButton[] bts;

    public Window1() {
        this.setSize(520, 400);
        this.setTitle("Change Color");
        bts = new JButton[4];
        String[] colors = {"Red", "Green", "Blue", "Gray"};
        this.setLayout(null);
        for (int i = 0; i < bts.length; i++) {
            bts[i] = new JButton(colors[i]);
            bts[i].setSize(100, 60);
            bts[i].setLocation(40 + i * 110, 260);
            bts[i].addMouseListener(this);
            this.add(bts[i]);
        }
        this.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        JButton sourceBt = (JButton) e.getSource();
        String colorTxt = sourceBt.getText();
        if (colorTxt.equals("Red")) {
            this.getContentPane().setBackground(Color.RED);
        } else if (colorTxt.equals("Blue")) {
            this.getContentPane().setBackground(Color.blue);
        } else if (colorTxt.equals("Green")) {
            this.getContentPane().setBackground(Color.green);
        } else if (colorTxt.equals("Gray")) {
            this.getContentPane().setBackground(Color.gray);
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }

    public static void main(String[] args) {
        new Window1();
    }
}

