import java.util.Scanner;//包（头文件）

public class CalcCircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //需要用户手工输入圆的半径
        System.out.println("请输入圆半径：");
        double radius = input.nextDouble();  //读取用户输入的下一个double类型数据，赋值给radius变量
        double area = 3.14 * radius * radius;
        System.out.println("圆的面积是：" + area);
        System.out.println("请输入品牌：");
        String brand1 = input.next();//next()两个截断符，回车和空格都是截断符
        System.out.println(brand1);
        //System.out.println("请输入品牌");
        //String brand2 = input.nextLine();//nextLine()只把回车当作截断符，读取完整个一行的内容
        //System.out.println(brand2);
        //推荐使用next()
        int id = input.nextInt();
        System.out.println("id为：" + id);
        //录入整形也还行
        //麻烦的是录入char型
        System.out.printf("请输入性别：");
        char sex = input.next().charAt(0);//获得用户输入字符串的第一个字符
        System.out.println("性别：" + sex);
    }
}