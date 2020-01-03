public class MyRectangle {
    private double height;
    private double width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return height*width;
    }
    public void showInfo(){
        System.out.println("Height:" + height + "\tWidth:" + width);
    }
}
