import java.util.Scanner;
public class KingOfFighter
{
    public static void main(String[] args) throws InterruptedException 
    {
        Scanner input = new Scanner(System.in);
        //�����������
        //Math.random()   //[0.0, 1.0)    
        //(int)(Math.random() * 10000) % 11 + 5;
        //1����ʼ��˫����ɫ
        System.out.print("�������������:");
        String userName = input.next();
        String comName = "����";//��������
        System.out.println(userName + " VS " + comName);
        //2����ʼ��˫������
        int hp1 = 100, hp2 = 100;//Ѫ��
        int attack1 = 0, attack2 = 0;//������
        //3��ʹ��ѭ��ģ���ս����
        while(hp1 > 0 && hp2 >= 0)
        {
            //����˫�������������
            attack1 = (int)(Math.random() * 10000) % 11 + 5;
            attack2 = (int)(Math.random() * 10000) % 11 + 5;
            //������ȹ���
            Thread.sleep(3000);//�ӳ�3��ִ������Ĵ���
            System.out.println(userName + "�����һ��-��˰��ǰѾƱ���" + comName + "��Ѫ" + attack2 + "����");
            hp2 -= attack1;//��ҹ��������Կ�Ѫ
            System.out.println(comName + "�����һ��-��˰��ǰѾƱ���" + userName + "��Ѫ" + attack1 + "����");
            hp1 -= attack2;
        }
        //4��ӡ���ս��
        System.out.println("KO!");
        System.out.println("�������\tѪ��");
        System.out.println(userName + "\t\t" + hp1);
        System.out.println(comName + "\t\t" + hp2);
    }
}