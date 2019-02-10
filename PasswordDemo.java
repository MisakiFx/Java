/**
 * 密码验证系统
 * 三次机会，正确则进入，三次机会用完则强制退出
 */
import java.util.Scanner;
public class PasswordDemo 
{
    public static void main(String[] args) 
    {
        final String PASSWORD = "123456";
        int i = 0;
        Scanner input = new Scanner(System.in);
        String password = null;//密码
        String username = "";
        while(i < 3)
        {
            System.out.print("请输入密码：");
            password = input.next();
            //java也不能直接比较字符串
            i++;
            if(!PASSWORD.equals(password))
            {
                if(i == 3)
                {
                    System.out.println("密码输入错误三次！强制退出！");
                    System.exit(0);
                }
            }
            else 
            {
                //想办法退出
                i = 3;
            }
        }
        System.out.println("密码输入正确成功进入本系统");
    }
}