/**
 * ������֤ϵͳ
 * ���λ��ᣬ��ȷ����룬���λ���������ǿ���˳�
 */
import java.util.Scanner;
public class PasswordDemo 
{
    public static void main(String[] args) 
    {
        final String PASSWORD = "123456";
        int i = 0;
        Scanner input = new Scanner(System.in);
        String password = null;//����
        String username = "";
        while(i < 3)
        {
            System.out.print("���������룺");
            password = input.next();
            //javaҲ����ֱ�ӱȽ��ַ���
            i++;
            if(!PASSWORD.equals(password))
            {
                if(i == 3)
                {
                    System.out.println("��������������Σ�ǿ���˳���");
                    System.exit(0);
                }
            }
            else 
            {
                //��취�˳�
                i = 3;
            }
        }
        System.out.println("����������ȷ�ɹ����뱾ϵͳ");
    }
}