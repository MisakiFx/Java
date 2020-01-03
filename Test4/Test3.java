import java.util.*;
//100个随机数
/*public class Test3 {
		public static void main(String args[]){
			double a[]=new double[7];
			for(int i=0;i<100;i++){
				a[(int)(Math.random()*6)+1]++;
			}
			for(int i=1;i<=6;i++){
				System.out.print(i+"出现的概率：");
				System.out.printf("%.2f\n",a[i]/100.0);
			}
		}
}*/
public class Test3{
	public static void main(String args[]){
		double a[]=new double[7];
		for(int i=0;i<1000;i++){
			a[(int)(Math.random()*6)+1]++;
		}
		for(int i=1;i<=6;i++){
			System.out.print(i+"出现的概率：");
			System.out.printf("%.2f\n",a[i]/1000.0);
		}
	}
}