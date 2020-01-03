public class Rectangle {
    private double width;
    private double height;
    private String color ;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
        this.color = "°×É«";
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimerter(){
        return (this.width + this.height) * 2;
    }

    @Override
    public String toString() {
        System.out.println("¿í" + this.width + "\t  ¸ß" + this.height + "\t  ÑÕÉ«" + this.color);
        return super.toString();
    }
}
