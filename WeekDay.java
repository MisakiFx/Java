import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        System.out.print("��������������ڼ���");
        int dayOfWeek = new Scanner(System.in).nextInt();
        //����
        ShowWeekDayByChinese(dayOfWeek);
        //����
        ShowWeekDayByJapanese(dayOfWeek);
        //Ӣ��
        showWeekDayByEnglish(dayOfWeek);
        
    }
    /**
     * �����жϴ���Ĳ����Ƿ���1-7֮��
     * ����Ϸ�����true ���򷵻�false
     */
    private static boolean IsWeekdayValidate(int dayOfWeek) {//����˽�к���ֻ�����ڲ����е���
        if(dayOfWeek < 1 || dayOfWeek > 7) {
            return false;
        }
        return true;
    }
    /**
     * �����ĵķ�ʽ��ӡ���ڼ���
     * dayOfWeek 1-7֮�������������ʾ���ڼ�
     */
    public static void ShowWeekDayByChinese(int dayOfWeek) {
        if(!IsWeekdayValidate(dayOfWeek)) {
           System.out.println("��������1-7֮�������");
           return;  
        }
        String[] weekdays = {"����һ", "���ڶ�", "������", "������", "������", "������", "������"};
        System.out.println(weekdays[dayOfWeek - 1]);
    }
    static void ShowWeekDayByJapanese(int dayOfWeek) {
        if(!IsWeekdayValidate(dayOfWeek)) {
           System.out.println("��������1-7֮�������");
           return;  
        }
        String[] weekdays = {"������", "������", "ˮ����", "ľ����", "������", "������", "������"};
        System.out.println(weekdays[dayOfWeek - 1]);
    }
    static void showWeekDayByEnglish(int dayOfWeek) {//��static�ſ����������е���
        if(!IsWeekdayValidate(dayOfWeek)) {
           System.out.println("��������1-7֮�������");
           return;  
        }
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thuursday", "Friday", "Saturday", "Sunday"};
        System.out.println(weekdays[dayOfWeek - 1]);
    }
}