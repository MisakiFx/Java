import java.util.Scanner;

public class ArrayDemo
{
    public static void main(String[] args) 
    {
        //����һ������
        //int[] nums = null;
        //û�и�nums����ռ�
        //nums[0] = 9;
        //��C����һ������������Ԫ�ص��׵�ַ
        int[] nums = new int[5];//������һ��nums���鲢�Ҹ�����5�����οռ�
        //����ĳ�ʼ��
        //�����ʼ�����ܸ�ָ���ռ�
        int years[] = {2012,2013,2014,2015,2016};
        int[] months = {1, 2, 3, 4, 5};
        //��̬�����鸳ֵ
        Scanner input = new Scanner(System.in);
        double[] scores = new double[5];
        double sum = 0, avg;//�ܳɼ���ƽ���ɼ�
        for(int i = 0 ; i < scores.length; i++)//java�����鳤��̫������
        {
            System.out.print("�������" + (i + 1) + "λͬѧ�ĳɼ���");
            //���û������double�������飬��ֵ�������еĵ�i��Ԫ��
            scores[i] = input.nextDouble();
        }
        //��ӡ¼��
        for(int i = 0 ; i < scores.length; i++)
        {
            sum += scores[i];
        }
        System.out.printf("%dλͬѧ��ƽ���ɼ�Ϊ��%.2f\n", scores.length, sum / scores.length);
        //��ӡ쳲���������
        int[] fibs = new int[15];
        fibs[0] = 0;
        fibs[1] = 1;
        for(int i = 2; i < fibs.length; i++)
        {
            fibs[i] = fibs[i - 1] + fibs[i - 2];
        }
        System.out.println("��ӡ�����");
        for (int i = 0; i < fibs.length; i++) 
        {
            System.out.print(fibs[i] + ",");    
        }
        System.out.println();
    }
}