import java.util.*;
import java.io.*;
 
public class Test7 {
		public static void main(String args[]){
			String s="Let us study Java";
			String s1,s2,s3;
			s1=s.toUpperCase();
			s2=s.toLowerCase();
			s3=s.replace(' ', '#');
			System.out.println("大写字母："+s1);
			System.out.println("小写字母："+s2);
			System.out.println("把字符串中的空格用符号“#”替换："+s3);
		}
}
