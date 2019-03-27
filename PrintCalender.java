import java.io.SequenceInputStream;
import java.util.Scanner;

import com.sun.javafx.runtime.SystemProperties;

/**
 * 使用方法实现月历的打印
 */
public class PrintCalender {
    //用户输入的年份
    public static int year = Integer.MIN_VALUE;
    //用户输入的月份
    public static int month = Integer.MIN_VALUE;
    /**对应每个月份的参数 */
    private  static int[] dayOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    public static void main(String[] args) {
        PrintCalender();
    }
    private static void PrintMonthTitle() {
        String[] monthNames = {"一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"};
        System.out.println("\t\t" + year + "\t" + monthNames[month - 1]);
        String[] weekdays = {"月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日", "日曜日"};
        for(int i = 0; i < weekdays.length; i++) {
            System.out.print(weekdays[i] + "\t");
        }

        System.out.println();
    }
    /**
     * 打印月历的核心方法
     **/
    public static void PrintCalender() {
        //1、让用户输入年份和月份
        InputYearAndMonth();
        //2、计算1900-1-1到用户输入年份月份的总天数（year = 2017, month = 7）
        //  2-1、计算各年的总天数
        //  2-2、计算各月的总天数
        int sum = GetSumDayOfYears();
        sum += GetSumDayOfMonth();
        sum++;
        //3、打印年份和月份
        PrintMonthTitle();
        //4、打印月份的标题（星期一到星期日）
        //5、根据某月1日是星期几打印月历的全部内容
        PrintCalenderContent(sum % 7);
    }
    /**
     * 根据当月一号打印月历的内容
     * @param dayOfweek  当月一号是星期几
     */
    private static void PrintCalenderContent(int dayOfWeek) {
        //注意，dayOfWeek取值范围是0 - 6
        int sepCont = 0;// \t的数量
        if(dayOfWeek == 0) {
            sepCont  = 6;
        }
        else {
            sepCont = dayOfWeek - 1;
        }
        for(int i = 0; i < sepCont; i++)
        {
            System.out.print("\t");
        }
        for(int i = 0; i < dayOfMonth[month - 1]; i++) {
            System.out.print(i + 1);
            //周日
            if((dayOfWeek + i) % 7 == 0) {
                System.out.print("\n");
            }
            else {
                System.out.print("\t");
            }
        }
    }
    /**
     * 获得1900到year年的总天数
     */
    private static int GetSumDayOfYears() {
        //需要判断用户是否已经正确输入了年份
        if(year == Integer.MIN_VALUE) {
            System.out.println("年份错误，请重新输入年份和月份！");
            InputYearAndMonth();
        }
        int sum = 0;
        for(int i = 1900; i < year; i++) {
            sum += 365;//每一年累加365天
            if(IsLeepYear(i)) {
                sum++;//闰年多加一天
            }
        }
        return sum;
    }
    /**
     * 用来判断传入的year变量是不是闰年
     * 是闰年返回true
     */
    private static boolean IsLeepYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
    /**
     * 接收用户输入的年份和月份
     */
    private static void InputYearAndMonth() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份：");
        year = input.nextInt();
        System.out.println("请输入月份：");
        month = input.nextInt();
        //用完关闭节省资源
        input.close();
        input = null;
    }
    /**
     * 得到year年1月1日到year年month-1月最后一天的总天数
     * @return
     */
    private static int GetSumDayOfMonth() {
        int sum = 0;
        for(int i = 0; i < month - 1; i++) {
            sum += dayOfMonth[i];
            //如果year年是闰年，并且month>=3
        }
        if (IsLeepYear(year) && month >= 3) {
            sum++;
        }
        return sum;
    }
}