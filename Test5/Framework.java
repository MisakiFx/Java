import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Framework extends JFrame implements ActionListener{
    public JFrame f;
    public JPanel panel1, panel2;
    public JButton bt1, bt2, bt3, bt4, bt5, bt6;

    public Framework() {
        f=new JFrame();
        f.setSize(300, 200);
        f.setLayout(new BorderLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1=new JPanel();
        panel2=new JPanel();
        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new BorderLayout());
        bt1=new JButton("BT1.1");
        panel1.add(bt1,BorderLayout.LINE_START);
        bt2=new JButton("BT1.2");
        panel1.add(bt2,BorderLayout.CENTER);
        bt3=new JButton("BT1.3");
        panel1.add(bt3,BorderLayout.LINE_END);
        bt4=new JButton("BT2.1");
        panel2.add(bt4,BorderLayout.LINE_START);
        bt5=new JButton("BT2.2");
        panel2.add(bt5,BorderLayout.CENTER);
        bt6=new JButton("BT2.3");
        panel2.add(bt6,BorderLayout.LINE_END);
        f.add(panel1,BorderLayout.PAGE_START);
        f.add(panel2,BorderLayout.PAGE_END);
        f.setVisible(true);

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == bt1) {
            System.out.println(bt1.getText());
        } else if (e.getSource() == bt2) {
            System.out.println(bt2.getText());
        } else if (e.getSource() == bt3) {
            System.out.println(bt3.getText());
        } else if (e.getSource() == bt4) {
            System.out.println(bt4.getText());
        } else if (e.getSource() == bt5) {
            System.out.println(bt5.getText());
        } else if (e.getSource() == bt6) {
            System.out.println(bt6.getText());
        }
    }
    public static void main(String[] args) {
        new Framework();
    }
}
