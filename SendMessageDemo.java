import java.util.concurrent.TimeUnit;
//函数重载和C++相同，就是可以根据相同函数的不同参数表调用到不同的方法
/**
 * 模拟实现游戏中的频道喊话功能 可选参数为喊话者的名称，频道名称，信息，数量，时间间隔
 */
public class SendMessageDemo {
    public static void main(String[] args) {
        //SendMessage("Misaki", "世界频道", "我是你的小可爱！！！", 10, 1);
        SendMessage("Misaki");
    }

    /**
     * name 喊话者的名称 
     * channelName 喊话的频道名称 
     * message 喊话的内容 
     * count 喊话的数量 
     * interval 喊话的时间间隔()
     */
    public static void SendMessage(String name, String channalName, String message, int count, int interval) {
        // 喊话的总体逻辑，拼接字符串后打印出来
        // 格式化拼接函数
        //if(interval < 5) {
        //    interval = 5;
        //}
        String value = String.format("【%s】 %s: %s", channalName, name, message);
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
     * 只需要用户提供姓名即可进行默认的喊话
     */
    public static void SendMessage(String nickName) {
        String[]  contains = {
            "你吃了么？",
            "保护我方孙尚香！",
            "万物皆虚，万事皆允"
        };
        SendMessage(nickName, "默认频道", contains[(int)(Math.random() * 2)], 10, 1);
    }
    /**
     * 重载的喊话函数
     * nickName:昵称
     * channalName:频道名称
     */
    public static void SendMessage(String nickName, String channalName)
    {
        SendMessage(
            nickName, channalName, "", 10, 1);
    }
}