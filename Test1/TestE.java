public class TestE {
    public static void main(String[] args) {
        char c = '\0';
        for (int i = 0; i <= 4 ; i++) {
            switch(i){
                case 1: c = 'Äã';
                    System.out.println(c);
                case 2: c = 'ºÃ';
                    System.out.println(c);
                    break;
                case 3: c = '¿á';
                    System.out.println(c);
                default:
                    System.out.println("! ");
            }
        }
    }
}
