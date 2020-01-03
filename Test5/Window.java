import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window extends JFrame implements ActionListener {
    private JButton bt=new JButton("复制");
    private JTextField text=new JTextField(100);
    private JLabel label =new JLabel(" ");
    public Window(){
        JFrame f=new JFrame("COPY");
        f.setLayout(new GridLayout(1,3,50,50));
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(text);
        f.add(bt);
        bt.addActionListener(this);
        f.add(label);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==bt){
            label.setText(text.getText());
        }
    }
    public static void main(String[] args) {
        new Window();
    }
}
