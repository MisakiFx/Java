public class Mysquare extends MyRectangle{
    private double width;

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return Math.pow(width,2);
    }

    @Override
    public void showInfo() {
        System.out.println("正方形边长：" + width);
    }
}
