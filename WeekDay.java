import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        System.out.print("请输入今天是星期几：");
        int dayOfWeek = new Scanner(System.in).nextInt();
        //中文
        ShowWeekDayByChinese(dayOfWeek);
        //日文
        ShowWeekDayByJapanese(dayOfWeek);
        //英文
        showWeekDayByEnglish(dayOfWeek);
        
    }
    /**
     * 用来判断传入的参数是否在1-7之间
     * 如果合法返回true 否则返回false
     */
    private static boolean IsWeekdayValidate(int dayOfWeek) {//定义私有函数只能在内部进行调用
        if(dayOfWeek < 1 || dayOfWeek > 7) {
            return false;
        }
        return true;
    }
    /**
     * 以中文的方式打印星期几，
     * dayOfWeek 1-7之间的数字用来表示星期几
     */
    public static void ShowWeekDayByChinese(int dayOfWeek) {
        if(!IsWeekdayValidate(dayOfWeek)) {
           System.out.println("必须输入1-7之间的数字");
           return;  
        }
        String[] weekdays = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"};
        System.out.println(weekdays[dayOfWeek - 1]);
    }
    static void ShowWeekDayByJapanese(int dayOfWeek) {
        if(!IsWeekdayValidate(dayOfWeek)) {
           System.out.println("必须输入1-7之间的数字");
           return;  
        }
        String[] weekdays = {"月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日", "日曜日"};
        System.out.println(weekdays[dayOfWeek - 1]);
    }
    static void showWeekDayByEnglish(int dayOfWeek) {//加static才可在主函数中调用
        if(!IsWeekdayValidate(dayOfWeek)) {
           System.out.println("必须输入1-7之间的数字");
           return;  
        }
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thuursday", "Friday", "Saturday", "Sunday"};
        System.out.println(weekdays[dayOfWeek - 1]);
    }
}