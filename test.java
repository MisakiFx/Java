//package com.Test;
//让test继承test2，直接使用Test2()
public class test implements testIn
{
    public void Test(int num)
    {
        
    }
    public void Test2()
    {
        System.out.println("321");
    }
    //public static void main(String[] args) 
    //{
    //    System.out.println("123");
    //}
    public static void main(String[] args) 
    {
        testIn a = new test();
        a.Test2();
    }
};  