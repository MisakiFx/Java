import java.util.Scanner;
 
public class Test5 {
		public static void main(String args[]){
			Scanner in=new Scanner(System.in);
			String s,c;
			s=in.next();
			c=in.next();
			System.out.println(s.replace(c,""));
		}
}