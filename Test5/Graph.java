import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Graph extends JFrame implements MouseListener{
    public JPanel panel1,panel2,panel3,panel4;
    public JButton bt1,bt2;
    public JLabel lb1,lb2,lb3;
    public JTextField t1,t2,t3;
    public JTextArea ta;

    public Graph(){
        setSize(450,450);
        setTitle("Input Demo");
        setLayout(null);

        panel1=new JPanel();
        panel1.setSize(50,100);
        panel1.setLocation(50,20);
        panel1.setLayout(new GridLayout(3,1));

        lb1=new JLabel("姓名：");
        panel1.add(lb1);
        lb2=new JLabel("性别：");
        panel1.add(lb2);
        lb3=new JLabel("年龄：");
        panel1.add(lb3);
        this.add(panel1);

        panel2=new JPanel();
        panel2.setSize(300,100);
        panel2.setLocation(100,20);
        panel2.setLayout(new GridLayout(3,1));

        t1=new JTextField();
        panel2.add(t1);
        t2=new JTextField();
        panel2.add(t2);
        t3=new JTextField();
        panel2.add(t3);
        this.add(panel2);

        panel3=new JPanel();
        panel3.setSize(200,50);
        panel3.setLocation(125,130);
        panel3.setLayout(new GridLayout(1,2));

        bt1=new JButton("OK");
        bt2=new JButton("Clear");
        bt1.addMouseListener(this);
        bt2.addMouseListener(this);
        panel3.add(bt1);
        panel3.add(bt2);
        this.add(panel3);

        panel4=new JPanel();
        panel4.setSize(420,200);
        panel4.setLocation(15,200);
        panel4.setLayout(new GridLayout(1,1));

        ta=new JTextArea(12,34);
        JScrollPane scrollPane=new JScrollPane(ta);
        ta.setEditable(false);
        panel4.add(scrollPane);
        this.add(panel4);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        JButton sourceBt = (JButton) e.getSource();
        String txt=sourceBt.getText();
        if(txt.equals("OK")){
            ta.append("姓名："+t1.getText()+"\n");
            ta.append("性别："+t2.getText()+"\n");
            ta.append("年龄："+t3.getText()+"\n");
        }
        else if(txt.equals("Clear")){
            ta.setText(null);
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
        new Graph();
    }
}
