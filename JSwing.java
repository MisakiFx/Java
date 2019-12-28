import javax.swing.*;
import java.awt.*;
public class JSwing extends JFrame
{
    public JSwing()
    {
        setTitle("这是一个窗体");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocation(200, 200);
        Container c = getContentPane();
        c.setLayout(null);
        setBackground(Color.WHITE);
        JLabel l = new JLabel("这是一个窗体");
        c.add(l);
        l.setBounds(0, 10, 80, 30);
        JTextField text = new JTextField(200);
        //text.setBounds(0, 0, 10, 10);
        JButton bt = new JButton("按钮");
        bt.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println(text.getText());
            }
        });
        c.add(bt);
        bt.setBounds(100, 100, 100, 100);
        c.add(text);
        text.setBounds(40, 400, 200, 20);
        //setResizable(false);
    }
    public static void main(String[] args) {
        new JSwing();
    }
};