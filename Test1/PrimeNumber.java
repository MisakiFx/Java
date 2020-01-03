public class PrimeNumber {
    public static void main(String[] args){
        for (int i = 2; i <1000 ; i++) {
            boolean flag = false;
            for (int j = 2; j <i ; j++) {
                if (i % j == 0)  flag = true;
            }
            if (!flag) System.out.print(i + " ");
        }
    }
}
