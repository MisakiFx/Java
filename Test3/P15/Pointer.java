import java.util.Objects;

public class Pointer {
    private double x;
    private double y;

    public Pointer(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void display(){
        System.out.println("X:" + x + "\tY:" + y);
    }
    @Override
    public String toString() {
        return "Pointer{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pointer)) return false;
        Pointer pointer = (Pointer) o;
        return Double.compare(pointer.x, x) == 0 &&
                Double.compare(pointer.y, y) == 0;
    }

    public double distance(Pointer pointer1){
        return Math.pow((Math.pow((x-pointer1.getX()),2) + Math.pow((y-pointer1.getY()),2)),0.5);
    }
}
