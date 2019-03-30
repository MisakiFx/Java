package Circle;
public class CircleV3 {
    /**半径 */
    private double radius;
    /**面积 */
    private double perimeter;
    /**周长 */
    private double area;
    public double GetRadius() {
        return radius;
    }
    public void  Show() {
        System.out.println("周长为：" + this.GetPerimeter());
        System.out.println("面积为：" + this.GetArea());
    }
    public void SetRadius(double radius) {//封装的好处
        if(radius <= 0) {
            radius = 1;
        }
        //this自指针
        this.radius = radius;
    }
    public double GetPerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
    public double GetArea() {
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}