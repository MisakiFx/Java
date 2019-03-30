package Circle;
public class CircleV3 {
    /**�뾶 */
    private double radius;
    /**��� */
    private double perimeter;
    /**�ܳ� */
    private double area;
    public double GetRadius() {
        return radius;
    }
    public void  Show() {
        System.out.println("�ܳ�Ϊ��" + this.GetPerimeter());
        System.out.println("���Ϊ��" + this.GetArea());
    }
    public void SetRadius(double radius) {//��װ�ĺô�
        if(radius <= 0) {
            radius = 1;
        }
        //this��ָ��
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