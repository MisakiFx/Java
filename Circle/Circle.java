import java.util.Scanner;

public class Circle {
    /**�뾶 */
    public double radius;
    /**�ܳ� */
    public double perimeter;
    /**��� */
    public double area;

    public void InputRaius() {
        Scanner input = new Scanner(System.in);
        System.out.println("������뾶");
        radius = input.nextDouble();
        input.close();
    }
    public void ShowPerimeter() {
        if(radius == 0) {
            InputRaius();//û������뾶
        }
        perimeter = 2 * Math.PI * radius;
        System.out.println("�ܳ�Ϊ��" + perimeter);
    }
    public void ShowArea() {
        if(radius == 0) {
            InputRaius();//û������뾶
        }
        area  = Math.PI * Math.pow(radius, 2);
        System.out.println("���Ϊ��" + area);
    }
}