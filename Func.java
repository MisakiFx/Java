import java.lang.*;//Integer Character 
import java.util.Scanner;
import java.lang.Math;
public class Func
{
    static void Print(Integer i)
    {
        System.out.println(i.intValue());
    }
    public static void main(String[] args) 
    {
        //Scanner input = new Scanner(System.in);
        ////Integer i = input.nextInt();
        ////Print(i);
        //String ch = input.nextLine();
        //System.out.println(Character.isDigit(ch.charAt(0)));
        //String str = new String("123");
        //str = str.concat("456");
        //System.out.println(str);
        String str = "123";
        String str1 = "456";
        //str = str.replace('2', '1');
        //str.replace(1, '3');
        String str2= new StringBuffer(str).append(str1).toString();
        System.out.println(str2);
    }
};