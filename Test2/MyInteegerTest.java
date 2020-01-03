public class MyInteegerTest {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(520);
        System.out.println(myInteger.getValue());
        System.out.println(myInteger.isEven());
        System.out.println(myInteger.isOdd());
        System.out.println(myInteger.isPrime());
        System.out.println(myInteger.equals(521));
        System.out.println(myInteger.parseInt("123"));
    }
}
