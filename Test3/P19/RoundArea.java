public class RoundArea extends Area {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
