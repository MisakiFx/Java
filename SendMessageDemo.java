import java.util.concurrent.TimeUnit;

/**
 * ģ��ʵ����Ϸ�е�Ƶ���������� ��ѡ����Ϊ�����ߵ����ƣ�Ƶ�����ƣ���Ϣ��������ʱ����
 */
public class SendMessageDemo {
    public static void main(String[] args) {
        SendMessage("Misaki", "����Ƶ��", "�������С�ɰ�������", 10, 1);
    }

    /**
     * name �����ߵ����� 
     * channelName ������Ƶ������ 
     * message ���������� 
     * count ���������� 
     * interval ������ʱ����()
     */
    public static void SendMessage(String name, String channelName, String message, int count, int interval) {
        // �����������߼���ƴ���ַ������ӡ����
        // ��ʽ��ƴ�Ӻ���
        //if(interval < 5) {
        //    interval = 5;
        //}
        String value = String.format("��%s�� %s: %s", channelName, name, message);
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
}