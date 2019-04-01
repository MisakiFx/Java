package BoxingDemo;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 包装类*/
public class BoxingDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
//		//补充字符包装类
//		String str = "123";
//		Integer.parseInt(str);//转换为相应的包装类类型
//		Double.parseDouble(str);
//		Character.isDigit('a');//判断字符是不是数字
//		
//		Character.isLetter('a');//判断字符是不是字母
//		Character.isJavaIdentifierPart('i');//判断用来定义java变量的单词中，除首字母外，其他字符是否合法
//		Character.isJavaIdentifierStart('i');
//		Character.isUpperCase('A');//判断是不是 大写字母
//		//String对象是不可变的，字符串一旦创建，内容不能改变
//		String name1 = "Misaki";
//		String name2 = "Misaki";
//		System.out.println(name1 == name2);//true
//		//字符串内存相同的话在内存中只会放一次（字符串池）
//		String value = "Misaki";
//		value += "可爱极了";
//		value = value.concat("可爱极了");//字符串拼接
//		String value2 = new String("Misaki");//创建新的内存空间用来存储
//		System.out.println(value);
//		String str1 = "Misaki";
//		String str2 = new String("Misaki");
//		String str3 = new String(str1);
//		char[] arr = {'a', 'b', 'c'};//与C语言中不一样
//		String str4 = new String(arr);
//		System.out.println(str4);
//		arr = str4.toCharArray();//字符串转字符数组
//		//字节数组
//		byte[] bytearr = {104, 101, 108, 108, 111};
//		String str5 = new String (bytearr);
//		System.out.println(str5);
//		String str6 = new String(str1.getBytes(), "UTF-8");
//		System.out.println(str6);
		//trim方法：去掉字符串左右两侧的空格
//		Scanner input = new Scanner(System.in);
//		System.out.println("请输入用户名");
//		String uName = input.nextLine().trim();
//		System.out.println("--" + uName + "--");
		///equals方法，比较字符串是否相等
//		System.out.println("abc".equals("abc"));
//		//comppareTo比较字符串的值，与C语言的strcmp一致
//		System.out.println("abc".compareTo("abc"));
//		//忽略大小写比较
//		System.out.println("abc".equalsIgnoreCase("ABC"));
//		System.out.println("abc".compareToIgnoreCase("ABC"));
//		//一个字符串是否包含另一个字符串
//		System.out.println("abc".contains("bc"));
//		Scanner input = new Scanner(System.in);
//		String password = "ab3456abc";
//		//返回字符或者字符串在另一个字符串中的下标，没查找返回-1
//		System.out.println(password.indexOf('3'));
//		System.out.println(password.indexOf("ab", 2));//从下标2开始查找
//		System.out.println(password.lastIndexOf("ab"));//从后往前数
		//substring截取字符串:参数范围:[1,3)
//		System.out.println(password.substring(1, 3));
//		//从3截取到最后
//		System.out.println(password.substring(3));
		//StringBuffer类的对象能够被多次修改
		//创造一个字符串拥有16个字符缓存的字符串
		StringBuffer strBuffer = new StringBuffer();
		StringBuffer strBuffer1 = new StringBuffer("abc");
		StringBuffer strBuffer2 = new StringBuffer(48);//默认添加48个缓存
		String str1 = strBuffer.toString();
		System.out.println(strBuffer1.reverse());//反转
		System.out.println(strBuffer1.insert(0, "123"));//插入
		System.out.println(strBuffer1.deleteCharAt(0));//删除
		System.out.println(strBuffer1.delete(0,2));//左闭右开
		System.out.println(strBuffer1.replace(0, 2, "12"));//替换
		strBuffer1.setCharAt(0, 'a');
		System.out.println(strBuffer1);//设置某个字符为
		System.out.println("缓存大小：" + strBuffer1.capacity());//3 + 16
		strBuffer1.setLength(0);//清空
		strBuffer1.trimToSize();//将缓冲区缩小为当前长度
		
		
//		//包装类没有无参构造并且一旦创建对象，内布值不可再改变
//		Integer num1 = 200;
//		Integer num2 = 200;
//		StringBuffer str1 = new StringBuffer("*");
//		str1.append("*");//拼接用StringBuffer效率更高
//		StringBuilder str2 = new StringBuilder("*");
//		str2.append("*");//拼接用StringBuilder效率更高
//		System.out.println(num1 == num2);
		//两个对象见比较，相等返回0
//		System.out.println(num1.compareTo(num2));
//		double num1 = 3.14;
//		//包装类更加强大的数据类型包装类
//		//方便完成数据类型转换比较等操作
//		Double dNum1_2 = 3.14;//自动装箱
//		Double dNum1 = new Double("3.14");//手动装箱，可以装箱其他类型
//		Double dnum1_1 = Double.valueOf(num1);//也可以这样装箱
//		num1 = dNum1;//自动拆箱
//		num1 = dNum1.doubleValue();//手动拆箱
//		System.out.println(num1 + "\t" + dNum1);
	}
}
