public class JavaProject{
    public static void main(String[] args) {
        System.out.println("���������Ⱥ��֮ŭ");//println()��ӡ������
        System.out.println("�Ѱ�\nΨһ");
        System.out.println("Զ��\t\t\t��");
        System.out.println("355 - 524�˺�\t\t�ٶ�2.70");
        String brand = "��˶ASUS";//Ʒ��
        String type = "GTX 1080";//����
        int hz = 1569;
        double length = 29.8;
        double width = 13.4;
        double height = 5.25;
        System.out.println("Ʒ�ƣ�" + brand);
        System.out.println("�ͺţ�" + type);
        System.out.println("����Ƶ�ʣ�" + hz + "MHz");
        System.out.println("����ߣ�" + length + "\\" + width + "\\" + height);
        //δ��ʼ����ֵ�������ӡ�������C���Ի�̫
        System.out.printf("���Ϊ��%.2f\n" ,length);
        //JDK5�Ժ�֧��ҽ������д��
        String str = String.format("����ǣ�%d\n", 20);
        System.out.println(str);
        
    }
}