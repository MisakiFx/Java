import java.util.Scanner;
/**
 * 2019.2.8
 * ������Ʒ�ܼۣ�����۸����50000��7�ۣ������9��
 * ��ӡ��Ʒ�ܼ�
 */
public class ShoppingDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //������Ʒ�۸�����
        double price, total;//�۸��ܼ�
        int count;//����
        System.out.print("������·��˹�����к��ֱ�ĵ��ۣ�");
        price = input.nextDouble();//����
        System.out.print("��������Ʒ������");
        count = input.nextInt();
        total = price * count;//�����ܼ�
        System.out.print("�����밮����ʱ������Ƥ���ĵ��ۣ�");
        price = input.nextDouble();//����
        System.out.print("��������Ʒ������");
        count = input.nextInt();
        total += price * count;//�����ۼӵ��ܼ�
        System.out.print("���������ζ�����������ˮ�ĵ��ۣ�");
        price = input.nextDouble();//����
        System.out.print("��������Ʒ������");
        count = input.nextInt(); 
        total += price * count;//�����ۼӵ��ܼ�
        //2�������ܼ�
        //3�������ܼ��ж��Ƿ����
        if(total >= 50000)
        {
            total *= 0.7;
        }
        else
        {
            total *= 0.9;
        }
        //4����ӡ���ۺ�Ӧ���Ľ��
        System.out.println("Ӧ�������ܽ��Ϊ��" + total);
    }
}