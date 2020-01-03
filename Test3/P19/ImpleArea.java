import java.util.Scanner;
public class ImpleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RoundArea circle = new RoundArea();
        System.out.print("请输入圆的半径：");
        circle.setRadius(input.nextDouble());
        RectArea rectangle = new RectArea();
        System.out.print("请输入长方形的长：");
        rectangle.setHeight(input.nextDouble());
        System.out.print("请输入长方形的宽：");
        rectangle.setWidth(input.nextDouble());
        System.out.println("圆的面积：" + circle.area());
        System.out.println("长方形的面积：" + rectangle.area());
    }

}
