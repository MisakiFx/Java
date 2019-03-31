package BoxingDemo;
/**
 * 包装类*/
public class BoxingDemo {
	public static void main(String[] args) {
		//补充字符包装类
		String str = "123";
		Integer.parseInt(str);//转换为相应的包装类类型
		Double.parseDouble(str);
		Character.isDigit('a');//判断字符是不是数字
		
		Character.isLetter('a');//判断字符是不是字母
		Character.isJavaIdentifierPart('i');//判断用来定义java变量的单词中，除首字母外，其他字符是否合法
		Character.isJavaIdentifierStart('i');
		Character.isUpperCase('A');//判断是不是 大写字母
		
		
		
		
		
//		//包装类没有无参构造并且一旦创建对象，内布值不可再改变
//		Integer num1 = 200;
//		Integer num2 = 200;
		
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
