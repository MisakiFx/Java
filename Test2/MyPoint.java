public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint point1,MyPoint point2){
        return Math.sqrt(Math.pow((point1.getX() - point2.getX()),2) + Math.pow((point1.getY() - point2.getY()),2));
    }
}
