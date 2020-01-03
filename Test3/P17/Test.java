public class Test {
    public static void main(String[] args) {
        MyRectangle rectangle = new MyRectangle();
        rectangle.setHeight(4);
        rectangle.setWidth(3);
        rectangle.showInfo();
        System.out.println("矩形面积" + rectangle.getArea());
        Mysquare mysquare = new Mysquare();
        mysquare.setWidth(10);
        mysquare.showInfo();
        System.out.println("正方形面积" + mysquare.getArea());
    }
}
