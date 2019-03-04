import java.util.concurrent.TimeUnit;

/**
 * 模拟实现游戏中的频道喊话功能 可选参数为喊话者的名称，频道名称，信息，数量，时间间隔
 */
public class SendMessageDemo {
    public static void main(String[] args) {
        SendMessage("Misaki", "世界频道", "我是你的小可爱！！！", 10, 1);
    }

    /**
     * name 喊话者的名称 
     * channelName 喊话的频道名称 
     * message 喊话的内容 
     * count 喊话的数量 
     * interval 喊话的时间间隔()
     */
    public static void SendMessage(String name, String channelName, String message, int count, int interval) {
        // 喊话的总体逻辑，拼接字符串后打印出来
        // 格式化拼接函数
        //if(interval < 5) {
        //    interval = 5;
        //}
        String value = String.format("【%s】 %s: %s", channelName, name, message);
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