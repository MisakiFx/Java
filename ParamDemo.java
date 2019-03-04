public class ParamDemo {
    public static void main(String[] args) {
        ParamTest("参数测试", 1, 2, 3, 4, 5);    
    }
    /**
     * 不定长函数参数
     * 只能出现在函数参数列表的最后一个
     * 等同于一个数组
     */
    public static void ParamTest(String str, int... nums) {
        System.out.println("第一个参数：" + str);
        System.out.println("参数数组的长度："  + nums.length);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}