public class Test {
    public static void main(String[] args) {
        Pointer pointer1 = new Pointer(10,10);
        Pointer pointer2 = new Pointer(20,20);
        System.out.println("pointer1中点(" + pointer1.getX()/2 +"," + pointer1.getY()/2 + ")");
        System.out.println("pointer2中点(" + pointer2.getX()/2 +"," + pointer2.getY()/2 + ")");
    }
}
