import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        //double num = 90.0;
        //int num2 = (int)num;//ǿ������ת��������C������һ��
        //double num3 = 90;//�Զ�����ת��
        //int num4 = 90;
        //double num5 = num4;//�Զ�����ת����С����ת������
        ////������Զ�����ת����ǿ������ת����C�����е�Ҫ�����һ��
        /*��������һ��������ת������*/
        Scanner input = new Scanner(System.in);
        System.out.println("������������");
        double money = input.nextDouble();
        //����ʽ
        int yuan = (int) money;
        int numOfShiYuan = yuan / 10;//ʮԪֽ�ҵ�����
        int numOfWuYuan = yuan % 10 / 5;//��Ԫֽ�ҵ�����
        int numOfYiYuan = yuan % 10 - 5;//һԪֽ�ҵ�����
        int jiao = ((int)(money * 10)) % 10;
        int numOfWuJiao = jiao / 5;//���ֽ�ҵ�����
        int numOfYiJiao = jiao - 5;//һ��ֽ�ҵ�����
        System.out.println("10Ԫֽ�ҵ�������" + numOfShiYuan);
        System.out.println("5Ԫֽ�ҵ�������" + numOfWuYuan);
        System.out.println("1Ԫֽ�ҵ�������" + numOfYiYuan);
        System.out.println("5��ֽ�ҵ�������" + numOfWuJiao);
        System.out.println("1��ֽ�ҵ�������" + numOfYiJiao);
    }
}