import java.util.Scanner;

public class ArrayDemo
{
    public static void main(String[] args) 
    {
        //创建一个数组
        //int[] nums = null;
        //没有给nums分配空间
        //nums[0] = 9;
        //和C语言一样数组名就是元素的首地址
        int[] nums = new int[5];//定义了一个nums数组并且赋予了5个整形空间
        //数组的初始化
        //数组初始化不能给指定空间
        int years[] = {2012,2013,2014,2015,2016};
        int[] months = {1, 2, 3, 4, 5};
        //动态给数组赋值
        Scanner input = new Scanner(System.in);
        double[] scores = new double[5];
        double sum = 0, avg;//总成绩和平均成绩
        for(int i = 0 ; i < scores.length; i++)//java求数组长度太方便了
        {
            System.out.print("请输入第" + (i + 1) + "位同学的成绩：");
            //将用户输入的double类型数组，赋值给数组中的第i个元素
            scores[i] = input.nextDouble();
        }
        //打印录入
        for(int i = 0 ; i < scores.length; i++)
        {
            sum += scores[i];
        }
        System.out.printf("%d位同学的平均成绩为：%.2f\n", scores.length, sum / scores.length);
        //打印斐波那契数列
        int[] fibs = new int[15];
        fibs[0] = 0;
        fibs[1] = 1;
        for(int i = 2; i < fibs.length; i++)
        {
            fibs[i] = fibs[i - 1] + fibs[i - 2];
        }
        System.out.println("打印结果：");
        for (int i = 0; i < fibs.length; i++) 
        {
            System.out.print(fibs[i] + ",");    
        }
        System.out.println();
    }
}