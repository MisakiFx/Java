import java.util.concurrent.TimeUnit;
//�������غ�C++��ͬ�����ǿ��Ը�����ͬ�����Ĳ�ͬ��������õ���ͬ�ķ���
/**
 * ģ��ʵ����Ϸ�е�Ƶ���������� ��ѡ����Ϊ�����ߵ����ƣ�Ƶ�����ƣ���Ϣ��������ʱ����
 */
public class SendMessageDemo {
    public static void main(String[] args) {
        //SendMessage("Misaki", "����Ƶ��", "�������С�ɰ�������", 10, 1);
        SendMessage("Misaki");
    }

    /**
     * name �����ߵ����� 
     * channelName ������Ƶ������ 
     * message ���������� 
     * count ���������� 
     * interval ������ʱ����()
     */
    public static void SendMessage(String name, String channalName, String message, int count, int interval) {
        // �����������߼���ƴ���ַ������ӡ����
        // ��ʽ��ƴ�Ӻ���
        //if(interval < 5) {
        //    interval = 5;
        //}
        String value = String.format("��%s�� %s: %s", channalName, name, message);
        for (int i = 0; i < count; i++) {
            System.out.println(value);
            try {
                //Thread.sleep((interval * 1000));
                TimeUnit.SECONDS.sleep(interval);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    /**
     * ֻ��Ҫ�û��ṩ�������ɽ���Ĭ�ϵĺ���
     */
    public static void SendMessage(String nickName) {
        String[]  contains = {
            "�����ô��",
            "�����ҷ������㣡",
            "������飬���½���"
        };
        SendMessage(nickName, "Ĭ��Ƶ��", contains[(int)(Math.random() * 2)], 10, 1);
    }
    /**
     * ���صĺ�������
     * nickName:�ǳ�
     * channalName:Ƶ������
     */
    public static void SendMessage(String nickName, String channalName)
    {
        SendMessage(
            nickName, channalName, "", 10, 1);
    }
}