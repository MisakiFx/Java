public class CalcAngles {
    public static void main(String[] args) {
        //1、设置坐标
        int x1 = 90, y1 = 180;
        int x2 = 205, y2 = 85;
        int x3 = 310, y3 = 240;
        //2、计算边长
        double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        //3、计算弧度
        double radiansA = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
        double radiansB = Math.acos((b * b - a * a - c * c) / (-2 * a * c));
        double radiansC = Math.acos((c * c - b * b - a * a) / (-2 * b * a));
        //4、将弧度转换为角度
        double degreeA = Math.toDegrees(radiansA);
        double degreeB = Math.toDegrees(radiansB);
        double degreeC = Math.toDegrees(radiansC);
        System.out.printf("三角形的三个内角为：%.2f\t%.2f\t%.2f", degreeA, degreeB, degreeC);
    }
}