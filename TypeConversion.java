import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        //double num = 90.0;
        //int num2 = (int)num;//强制类型转换，就是C语言呢一套
        //double num3 = 90;//自动类型转换
        //int num4 = 90;
        //double num5 = num4;//自动类型转换，小类型转大类型
        ////这里的自动类型转换和强制类型转换与C语言中的要求如出一辙
        /*接下来是一个人名币转换程序*/
        Scanner input = new Scanner(System.in);
        System.out.println("请输入金额总数");
        double money = input.nextDouble();
        //处理方式
        int yuan = (int) money;
        int numOfShiYuan = yuan / 10;//十元纸币的数量
        int numOfWuYuan = yuan % 10 / 5;//五元纸币的数量
        int numOfYiYuan = yuan % 10 - 5;//一元纸币的数量
        int jiao = ((int)(money * 10)) % 10;
        int numOfWuJiao = jiao / 5;//五角纸币的数量
        int numOfYiJiao = jiao - 5;//一角纸币的数量
        System.out.println("10元纸币的数量：" + numOfShiYuan);
        System.out.println("5元纸币的数量：" + numOfWuYuan);
        System.out.println("1元纸币的数量：" + numOfYiYuan);
        System.out.println("5角纸币的数量：" + numOfWuJiao);
        System.out.println("1角纸币的数量：" + numOfYiJiao);
    }
}