public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,40,"��ɫ");
        Rectangle rectangle2 = new Rectangle(3.5,35.9,"��ɫ");
        rectangle1.toString();
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimerter());
        rectangle2.toString();
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getPerimerter());
    }


}
