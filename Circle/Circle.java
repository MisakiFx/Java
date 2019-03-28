import java.util.Scanner;

public class Circle {
    /**半径 */
    public double radius;
    /**周长 */
    public double perimeter;
    /**面积 */
    public double area;

    public void InputRaius() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入半径");
        radius = input.nextDouble();
        input.close();
    }
    public void ShowPerimeter() {
        if(radius == 0) {
            InputRaius();//没有输入半径
        }
        perimeter = 2 * Math.PI * radius;
        System.out.println("周长为：" + perimeter);
    }
    public void ShowArea() {
        if(radius == 0) {
            InputRaius();//没有输入半径
        }
        area  = Math.PI * Math.pow(radius, 2);
        System.out.println("面积为：" + area);
    }
}