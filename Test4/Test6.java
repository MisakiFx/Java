
import java.util.*;
import java.io.*;
public class Test6 {
		public static void main(String args[]){
			String s;
			char s2[]=new char[110];
			char c=0;
			int sum=0;
			Scanner in=new Scanner(System.in);
			s=in.next();
			c=in.next().charAt(0);
			s2=s.toCharArray();
			for(int i=0;i<s2.length;i++){
				if(c==s2[i])sum++;
			}
			System.out.println(sum);
		}
}