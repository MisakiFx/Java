import java.util.Scanner;
import java.util.Arrays;
public class SortDemo {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    
    int[] nums = {45, 64, 75, 1, 78, 99, 0, 80};
    Arrays.sort(nums);//调用java库里面公用的排序函数
    for (int i = 0; i < nums.length; i++) {
        System.out.printf("%d\t", nums[i]);    
    }
    //默认正序，逆序的话需要首位交换
    System.out.println();
    for (int i = 0; i < nums.length / 2; i++) {//要想逆序，就得排序完颠倒整个结果
        int temp = nums[i];
        nums[i] = nums[nums.length - i - 1];
        nums[nums.length - i - 1] = temp;    
    }
    for (int i = 0; i < nums.length; i++) {
        System.out.printf("%d\t", nums[i]);    
    }
}
}