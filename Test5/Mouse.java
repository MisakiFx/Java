import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Mouse extends JFrame {
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
        new Mouse();
    }
    public Mouse(){
        JFrame f= new JFrame("Mouse");
        f.setLayout(new FlowLayout());
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JLabel label=new JLabel();
        label.setText("Click");
        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText(e.getX()+","+e.getY());
            }
        });
        f.add(label);
        f.setVisible(true);
    }
}
