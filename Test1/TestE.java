public class TestE {
    public static void main(String[] args) {
        char c = '\0';
        for (int i = 0; i <= 4 ; i++) {
            switch(i){
                case 1: c = '��';
                    System.out.println(c);
                case 2: c = '��';
                    System.out.println(c);
                    break;
                case 3: c = '��';
                    System.out.println(c);
                default:
                    System.out.println("! ");
            }
        }
    }
}
