package BoxingDemo;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * ��װ��*/
public class BoxingDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
//		//�����ַ���װ��
//		String str = "123";
//		Integer.parseInt(str);//ת��Ϊ��Ӧ�İ�װ������
//		Double.parseDouble(str);
//		Character.isDigit('a');//�ж��ַ��ǲ�������
//		
//		Character.isLetter('a');//�ж��ַ��ǲ�����ĸ
//		Character.isJavaIdentifierPart('i');//�ж���������java�����ĵ����У�������ĸ�⣬�����ַ��Ƿ�Ϸ�
//		Character.isJavaIdentifierStart('i');
//		Character.isUpperCase('A');//�ж��ǲ��� ��д��ĸ
//		//String�����ǲ��ɱ�ģ��ַ���һ�����������ݲ��ܸı�
//		String name1 = "Misaki";
//		String name2 = "Misaki";
//		System.out.println(name1 == name2);//true
//		//�ַ����ڴ���ͬ�Ļ����ڴ���ֻ���һ�Σ��ַ����أ�
//		String value = "Misaki";
//		value += "�ɰ�����";
//		value = value.concat("�ɰ�����");//�ַ���ƴ��
//		String value2 = new String("Misaki");//�����µ��ڴ�ռ������洢
//		System.out.println(value);
//		String str1 = "Misaki";
//		String str2 = new String("Misaki");
//		String str3 = new String(str1);
//		char[] arr = {'a', 'b', 'c'};//��C�����в�һ��
//		String str4 = new String(arr);
//		System.out.println(str4);
//		arr = str4.toCharArray();//�ַ���ת�ַ�����
//		//�ֽ�����
//		byte[] bytearr = {104, 101, 108, 108, 111};
//		String str5 = new String (bytearr);
//		System.out.println(str5);
//		String str6 = new String(str1.getBytes(), "UTF-8");
//		System.out.println(str6);
		//trim������ȥ���ַ�����������Ŀո�
//		Scanner input = new Scanner(System.in);
//		System.out.println("�������û���");
//		String uName = input.nextLine().trim();
//		System.out.println("--" + uName + "--");
		///equals�������Ƚ��ַ����Ƿ����
//		System.out.println("abc".equals("abc"));
//		//comppareTo�Ƚ��ַ�����ֵ����C���Ե�strcmpһ��
//		System.out.println("abc".compareTo("abc"));
//		//���Դ�Сд�Ƚ�
//		System.out.println("abc".equalsIgnoreCase("ABC"));
//		System.out.println("abc".compareToIgnoreCase("ABC"));
//		//һ���ַ����Ƿ������һ���ַ���
//		System.out.println("abc".contains("bc"));
//		Scanner input = new Scanner(System.in);
//		String password = "ab3456abc";
//		//�����ַ������ַ�������һ���ַ����е��±꣬û���ҷ���-1
//		System.out.println(password.indexOf('3'));
//		System.out.println(password.indexOf("ab", 2));//���±�2��ʼ����
//		System.out.println(password.lastIndexOf("ab"));//�Ӻ���ǰ��
		//substring��ȡ�ַ���:������Χ:[1,3)
//		System.out.println(password.substring(1, 3));
//		//��3��ȡ�����
//		System.out.println(password.substring(3));
		//StringBuffer��Ķ����ܹ�������޸�
		//����һ���ַ���ӵ��16���ַ�������ַ���
		StringBuffer strBuffer = new StringBuffer();
		StringBuffer strBuffer1 = new StringBuffer("abc");
		StringBuffer strBuffer2 = new StringBuffer(48);//Ĭ�����48������
		String str1 = strBuffer.toString();
		System.out.println(strBuffer1.reverse());//��ת
		System.out.println(strBuffer1.insert(0, "123"));//����
		System.out.println(strBuffer1.deleteCharAt(0));//ɾ��
		System.out.println(strBuffer1.delete(0,2));//����ҿ�
		System.out.println(strBuffer1.replace(0, 2, "12"));//�滻
		strBuffer1.setCharAt(0, 'a');
		System.out.println(strBuffer1);//����ĳ���ַ�Ϊ
		System.out.println("�����С��" + strBuffer1.capacity());//3 + 16
		strBuffer1.setLength(0);//���
		strBuffer1.trimToSize();//����������СΪ��ǰ����
		
		
//		//��װ��û���޲ι��첢��һ�����������ڲ�ֵ�����ٸı�
//		Integer num1 = 200;
//		Integer num2 = 200;
//		StringBuffer str1 = new StringBuffer("*");
//		str1.append("*");//ƴ����StringBufferЧ�ʸ���
//		StringBuilder str2 = new StringBuilder("*");
//		str2.append("*");//ƴ����StringBuilderЧ�ʸ���
//		System.out.println(num1 == num2);
		//����������Ƚϣ���ȷ���0
//		System.out.println(num1.compareTo(num2));
//		double num1 = 3.14;
//		//��װ�����ǿ����������Ͱ�װ��
//		//���������������ת���ȽϵȲ���
//		Double dNum1_2 = 3.14;//�Զ�װ��
//		Double dNum1 = new Double("3.14");//�ֶ�װ�䣬����װ����������
//		Double dnum1_1 = Double.valueOf(num1);//Ҳ��������װ��
//		num1 = dNum1;//�Զ�����
//		num1 = dNum1.doubleValue();//�ֶ�����
//		System.out.println(num1 + "\t" + dNum1);
	}
}
