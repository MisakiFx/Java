package DialogDemo;
/** java��ѡ����� */
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DialogDemo {
    public static void main(String[] args) {
        //����1���Ի���ĸ�������Ϣ
        //JOptionPane.showMessageDialog(null, "��ʾ��Ϣ");
        //����2���Ի����е���ʾ��Ϣ
        //����3���Ի���ı�����Ϣ
        //����4���Ի������Ϣ����
        //JOptionPane.showMessageDialog(null, "���������ô", "�꺮��ů", JOptionPane.WARNING_MESSAGE);
        //����5���Ի�������ʾ��ͼƬ
        //JOptionPane.showMessageDialog(null, "���������ô", "�꺮��ů", JOptionPane.WARNING_MESSAGE, new ImageIcon("images/3.jpg"));
        //����6��ѡ��
        //JOptionPane.showInputDialog(null, "����ô", "����", 0, new ImageIcon("images/3.jpg"), new String[]{"1.����", "2.û��"}, "Ĭ��ֵ");
        JOptionPane.showConfirmDialog(null, "����ȥ��ȥ�Է�");
    }
}