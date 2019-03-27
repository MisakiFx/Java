import java.io.SequenceInputStream;
import java.util.Scanner;

import com.sun.javafx.runtime.SystemProperties;

/**
 * ʹ�÷���ʵ�������Ĵ�ӡ
 */
public class PrintCalender {
    //�û���������
    public static int year = Integer.MIN_VALUE;
    //�û�������·�
    public static int month = Integer.MIN_VALUE;
    /**��Ӧÿ���·ݵĲ��� */
    private  static int[] dayOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    public static void main(String[] args) {
        PrintCalender();
    }
    private static void PrintMonthTitle() {
        String[] monthNames = {"һ��", "����", "����", "����", "����", "����", "����", "����", "����", "ʮ��", "ʮһ��", "ʮ����"};
        System.out.println("\t\t" + year + "\t" + monthNames[month - 1]);
        String[] weekdays = {"������", "������", "ˮ����", "ľ����", "������", "������", "������"};
        for(int i = 0; i < weekdays.length; i++) {
            System.out.print(weekdays[i] + "\t");
        }

        System.out.println();
    }
    /**
     * ��ӡ�����ĺ��ķ���
     **/
    public static void PrintCalender() {
        //1�����û�������ݺ��·�
        InputYearAndMonth();
        //2������1900-1-1���û���������·ݵ���������year = 2017, month = 7��
        //  2-1����������������
        //  2-2��������µ�������
        int sum = GetSumDayOfYears();
        sum += GetSumDayOfMonth();
        sum++;
        //3����ӡ��ݺ��·�
        PrintMonthTitle();
        //4����ӡ�·ݵı��⣨����һ�������գ�
        //5������ĳ��1�������ڼ���ӡ������ȫ������
        PrintCalenderContent(sum % 7);
    }
    /**
     * ���ݵ���һ�Ŵ�ӡ����������
     * @param dayOfweek  ����һ�������ڼ�
     */
    private static void PrintCalenderContent(int dayOfWeek) {
        //ע�⣬dayOfWeekȡֵ��Χ��0 - 6
        int sepCont = 0;// \t������
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
            //����
            if((dayOfWeek + i) % 7 == 0) {
                System.out.print("\n");
            }
            else {
                System.out.print("\t");
            }
        }
    }
    /**
     * ���1900��year���������
     */
    private static int GetSumDayOfYears() {
        //��Ҫ�ж��û��Ƿ��Ѿ���ȷ���������
        if(year == Integer.MIN_VALUE) {
            System.out.println("��ݴ���������������ݺ��·ݣ�");
            InputYearAndMonth();
        }
        int sum = 0;
        for(int i = 1900; i < year; i++) {
            sum += 365;//ÿһ���ۼ�365��
            if(IsLeepYear(i)) {
                sum++;//������һ��
            }
        }
        return sum;
    }
    /**
     * �����жϴ����year�����ǲ�������
     * �����귵��true
     */
    private static boolean IsLeepYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
    /**
     * �����û��������ݺ��·�
     */
    private static void InputYearAndMonth() {
        Scanner input = new Scanner(System.in);
        System.out.println("��������ݣ�");
        year = input.nextInt();
        System.out.println("�������·ݣ�");
        month = input.nextInt();
        //����رս�ʡ��Դ
        input.close();
        input = null;
    }
    /**
     * �õ�year��1��1�յ�year��month-1�����һ���������
     * @return
     */
    private static int GetSumDayOfMonth() {
        int sum = 0;
        for(int i = 0; i < month - 1; i++) {
            sum += dayOfMonth[i];
            //���year�������꣬����month>=3
        }
        if (IsLeepYear(year) && month >= 3) {
            sum++;
        }
        return sum;
    }
}