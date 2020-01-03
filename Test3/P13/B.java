import java.util.Random;

public class B extends A{
    public void g(){
        String chinese = "¹þ¹þ¹þ";
        Random random = new Random();
        for (int i = 0; i < random.nextInt(100); i++) {
            System.out.println(chinese);
        }
    }
}
