public class MaxNumber {
    public static void main(String[] args) {

        int sumRusult = 0;
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            int mulitRusult = 1;
            for (int j = 1; j <= i; j++) {
                mulitRusult *= j; 
            }
            sumRusult += mulitRusult;
            if ((sumRusult + mulitRusult*(i+1)) >9999){
                System.out.println(i);
                break;
            }
            mulitRusult = 1;
        }
    }
}
