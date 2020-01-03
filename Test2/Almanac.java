package edu.javabase.Test2;

import java.util.Calendar;
import java.util.Scanner;

public class Almanac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input years:");
        int year = input.nextInt();
        input.close();
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,year);
        for (int i = 0; i < 12; i++) {
            c.set(Calendar.MONTH,i);
            printMonth(c);
        }

    }
    public static void printMonth(Calendar c){
        c.set(Calendar.DAY_OF_MONTH,1);   //设置成一日
        String[] monthName = {"January","February","March","April","May","June",
                "July","August","September","October","November","December"};
        System.out.println("\n  Month's name is " +  monthName[c.get(Calendar.MONTH)]);
        System.out.printf("===========================",c.get(Calendar.MONTH)+1);
        String[] weeks = { "\nSun", "Mon" ,  "Thu",  "Wed",  "The",  "Fri",  "Sat" };
        for (int i = 0; i < weeks.length; i++) {
            System.out.printf("%s" + (i != 6 ?"\t":"\n"),weeks[i]);
        }

        int offday = c.get(Calendar.DAY_OF_WEEK) - 1;

        for(int i = 0; i < offday; i++){
            System.out.printf("\t");
        }

        int month = c.get(Calendar.MONTH);
        while(c.get(Calendar.MONTH) == month ){
            System.out.printf("%d" + ( (c.get(Calendar.DAY_OF_WEEK)) != 7 ? "\t":"\n") ,c.get(Calendar.DAY_OF_MONTH));
            c.add(Calendar.DAY_OF_MONTH, 1);
        }
    }
}

