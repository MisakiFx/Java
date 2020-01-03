public class WaterFlowerNumber {
    public static void main(String[] args) {
        int a = 0,b = 0,c = 0;
        for (int i = 100; i < 999; i++) {
            a = i % 10;
            b = (i % 100 - a)/10;
            c = (i - b*10 - a)/100;
            if (a*a*a + b*b*b + c*c*c == i) System.out.println(i);
        }
    }
}
