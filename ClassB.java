public class ClassB extends ClassA
{
    public void A()
    {
        System.out.println("B");
    }
    public static void main(String[] args) 
    {
        ClassB b = new ClassB();
        b.A();    
    }
};