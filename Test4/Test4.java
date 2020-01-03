import java.util.Arrays;

public class Test4 {
    public static void main(String args[]) {
        int a[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int max_a = -1, min_a = 100, sum = 0;
        double average = 0;
        for (int i = 0; i < 10; i++) {
            sum += a[i];
            if (max_a < a[i])
                max_a = a[i];
            else {
                if (min_a > a[i])
                    min_a = a[i];
            }
        }
        Arrays.sort(a); // 排序函数，Arrays类
        System.out.println("最大值：" + max_a + " 最小值：" + min_a);
        System.out.println("最大值：" + a[9] + " 最小值：" + a[0]);
        System.out.println("数组所有元素的和：" + sum);
        System.out.printf("平均数：%.2f\n", sum / 10.0);
    }
}