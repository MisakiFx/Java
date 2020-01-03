public class MyPointTest {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(2,3);
        MyPoint point2 = new MyPoint(10,30.5);
        System.out.println("两点之间的距离为：" + point1.distance(point1,point2));
    }
}
