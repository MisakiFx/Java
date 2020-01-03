import javax.swing.*;
import java.awt.*;

public class Cal extends JFrame {

    public JPanel panel1;
    public JButton[] bts1;
    public JTextField txt;
    public JButton back;

    public Cal() {
        setSize(420, 540);
        setTitle("计算器");
        setLayout(null); 

        //文本框
        txt = new JTextField();
        txt.setSize(300, 80);
        txt.setLocation(100, 20);
        this.add(txt);
        back=new JButton("⟶");
        back.setSize(80,80);
        back.setLocation(20,20);
        this.add(back);

        panel1 = new JPanel();
        panel1.setSize(350, 350); 
        panel1.setLocation(20, 120); 
        panel1.setLayout(new GridLayout(4, 4));
        String[] strs1 = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"};
        bts1 = new JButton[16];
        for (int i = 0; i < bts1.length; i++) {
            bts1[i] = new JButton(strs1[i]);
            panel1.add(bts1[i]);
        }
        this.add(panel1);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Cal();
    }
}
