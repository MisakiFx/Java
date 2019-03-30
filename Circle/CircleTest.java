package Circle;
import java.util.Scanner;
public class CircleTest {
    public static void main(String[] args) {
        //Circle circle = new Circle();
        //circle.InputRaius();
        //circle.ShowPerimeter();
        //circle.ShowArea();
        CircleV3 circle = new CircleV3();
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        circle.SetRadius(radius);
        double perimeter = circle.GetPerimeter();
        System.out.println(perimeter);
        double area = circle.GetArea();
        System.out.println(area);
        circle.Show();
    }
}