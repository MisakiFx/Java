import java.util.Scanner;
import java.util.Arrays;
public class SortDemo {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    
    int[] nums = {45, 64, 75, 1, 78, 99, 0, 80};
    Arrays.sort(nums);//����java�����湫�õ�������
    for (int i = 0; i < nums.length; i++) {
        System.out.printf("%d\t", nums[i]);    
    }
    //Ĭ����������Ļ���Ҫ��λ����
    System.out.println();
    for (int i = 0; i < nums.length / 2; i++) {//Ҫ�����򣬾͵�������ߵ��������
        int temp = nums[i];
        nums[i] = nums[nums.length - i - 1];
        nums[nums.length - i - 1] = temp;    
    }
    for (int i = 0; i < nums.length; i++) {
        System.out.printf("%d\t", nums[i]);    
    }
}
}