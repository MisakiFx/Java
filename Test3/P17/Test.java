public class Test {
    public static void main(String[] args) {
        MyRectangle rectangle = new MyRectangle();
        rectangle.setHeight(4);
        rectangle.setWidth(3);
        rectangle.showInfo();
        System.out.println("�������" + rectangle.getArea());
        Mysquare mysquare = new Mysquare();
        mysquare.setWidth(10);
        mysquare.showInfo();
        System.out.println("���������" + mysquare.getArea());
    }
}
