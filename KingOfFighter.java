import java.util.Scanner;
public class KingOfFighter
{
    public static void main(String[] args) throws InterruptedException 
    {
        Scanner input = new Scanner(System.in);
        //生成随机数字
        //Math.random()   //[0.0, 1.0)    
        //(int)(Math.random() * 10000) % 11 + 5;
        //1、初始化双方角色
        System.out.print("请输入玩家名称:");
        String userName = input.next();
        String comName = "大蛇";//电脑名称
        System.out.println(userName + " VS " + comName);
        //2、初始化双方数据
        int hp1 = 100, hp2 = 100;//血量
        int attack1 = 0, attack2 = 0;//攻击力
        //3、使用循环模拟对战过程
        while(hp1 > 0 && hp2 >= 0)
        {
            //生成双方的随机攻击力
            attack1 = (int)(Math.random() * 10000) % 11 + 5;
            attack2 = (int)(Math.random() * 10000) % 11 + 5;
            //让玩家先攻击
            Thread.sleep(3000);//延迟3秒执行下面的代码
            System.out.println(userName + "打出了一记-里八百是把酒杯，" + comName + "掉血" + attack2 + "两！");
            hp2 -= attack1;//玩家攻击，电脑扣血
            System.out.println(comName + "打出了一记-里八百是把酒杯，" + userName + "掉血" + attack1 + "两！");
            hp1 -= attack2;
        }
        //4打印最终结果
        System.out.println("KO!");
        System.out.println("玩家名称\t血量");
        System.out.println(userName + "\t\t" + hp1);
        System.out.println(comName + "\t\t" + hp2);
    }
}