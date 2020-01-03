import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Frame extends JFrame implements MouseListener {
    JPanel panel1, panel2;
    JButton bt1, bt2, bt3;
    JTextArea ta;

    public Frame() {
        setSize(500, 500);
        setLayout(null);
        setTitle("JFrame Test");

        panel1 = new JPanel();
        panel1.setSize(300, 240);
        panel1.setLocation(20, 20);
        panel1.setLayout(new GridLayout(1, 1));
        ta = new JTextArea(30, 30);
        ta.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(ta);
        panel1.add(scrollPane);
        this.add(panel1);

        panel2 = new JPanel();
        panel2.setSize(300, 60);
        panel2.setLocation(20, 380);
        panel2.setLayout(new GridLayout(1, 3));
        bt1 = new JButton("OK");
        bt2 = new JButton("Cancel");
        bt3 = new JButton("Exit");
        bt1.addMouseListener(this);
        bt2.addMouseListener(this);
        bt3.addMouseListener(this);
        panel2.add(bt1);
        panel2.add(bt2);
        panel2.add(bt3);
        this.add(panel2);

        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        JButton sourceButton = (JButton) mouseEvent.getSource();
        String txt = sourceButton.getText();
        if (txt.equals("OK") || txt.equals("Cancel"))
            ta.append(sourceButton.getText() + "\n");
        else if (txt.equals("Exit"))
            System.exit(0);
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {}

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {}

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {}

    @Override
    public void mouseExited(MouseEvent mouseEvent) {}

    public static void main(String[] args) {
        new Frame();
    }
}