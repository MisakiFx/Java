package BoxingDemo;
/**
 * ��װ��*/
public class BoxingDemo {
	public static void main(String[] args) {
		//�����ַ���װ��
		String str = "123";
		Integer.parseInt(str);//ת��Ϊ��Ӧ�İ�װ������
		Double.parseDouble(str);
		Character.isDigit('a');//�ж��ַ��ǲ�������
		
		Character.isLetter('a');//�ж��ַ��ǲ�����ĸ
		Character.isJavaIdentifierPart('i');//�ж���������java�����ĵ����У�������ĸ�⣬�����ַ��Ƿ�Ϸ�
		Character.isJavaIdentifierStart('i');
		Character.isUpperCase('A');//�ж��ǲ��� ��д��ĸ
		
		
		
		
		
//		//��װ��û���޲ι��첢��һ�����������ڲ�ֵ�����ٸı�
//		Integer num1 = 200;
//		Integer num2 = 200;
		
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
