package DialogDemo;
/** java的选项面板 */
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DialogDemo {
    public static void main(String[] args) {
        //参数1：对话框的父窗体信息
        //JOptionPane.showMessageDialog(null, "提示信息");
        //参数2：对话框中的提示信息
        //参数3：对话框的标题信息
        //参数4：对话框的消息类型
        //JOptionPane.showMessageDialog(null, "今天你吃了么", "嘘寒问暖", JOptionPane.WARNING_MESSAGE);
        //参数5：对话框中显示的图片
        //JOptionPane.showMessageDialog(null, "今天你吃了么", "嘘寒问暖", JOptionPane.WARNING_MESSAGE, new ImageIcon("images/3.jpg"));
        //参数6：选项
        //JOptionPane.showInputDialog(null, "吃了么", "标题", 0, new ImageIcon("images/3.jpg"), new String[]{"1.吃了", "2.没吃"}, "默认值");
        JOptionPane.showConfirmDialog(null, "到底去不去吃饭");
    }
}