public class ParamDemo {
    public static void main(String[] args) {
        ParamTest("��������", 1, 2, 3, 4, 5);    
    }
    /**
     * ��������������
     * ֻ�ܳ����ں��������б�����һ��
     * ��ͬ��һ������
     */
    public static void ParamTest(String str, int... nums) {
        System.out.println("��һ��������" + str);
        System.out.println("��������ĳ��ȣ�"  + nums.length);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}