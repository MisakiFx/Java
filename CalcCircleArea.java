import java.util.Scanner;//����ͷ�ļ���

public class CalcCircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //��Ҫ�û��ֹ�����Բ�İ뾶
        System.out.println("������Բ�뾶��");
        double radius = input.nextDouble();  //��ȡ�û��������һ��double�������ݣ���ֵ��radius����
        double area = 3.14 * radius * radius;
        System.out.println("Բ������ǣ�" + area);
        System.out.println("������Ʒ�ƣ�");
        String brand1 = input.next();//next()�����ضϷ����س��Ϳո��ǽضϷ�
        System.out.println(brand1);
        //System.out.println("������Ʒ��");
        //String brand2 = input.nextLine();//nextLine()ֻ�ѻس������ضϷ�����ȡ������һ�е�����
        //System.out.println(brand2);
        //�Ƽ�ʹ��next()
        int id = input.nextInt();
        System.out.println("idΪ��" + id);
        //¼������Ҳ����
        //�鷳����¼��char��
        System.out.printf("�������Ա�");
        char sex = input.next().charAt(0);//����û������ַ����ĵ�һ���ַ�
        System.out.println("�Ա�" + sex);
    }
}