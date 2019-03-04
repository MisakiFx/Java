import java.util.Scanner;

/**
 * ʮ�����ƺ�ʮ����֮���ת��
 */
public class HexToDecimalDemo {
    public static void main(String[] args) {
    //1�����û�����һ��ʮ��������
    Scanner input = new Scanner(System.in);
    System.out.print("������һ���������֣�");
    int decNum = input.nextInt();
    //2��ʹ�÷�����ʮ����ת��Ϊʮ������
    System.out.println(DecToHex(decNum));
    //3���ٽ�ʮ���������ֻ���ʮ����
    System.out.println(HexToDec(DecToHex(decNum)));
    }
    /**
     * ���÷�����ʮ����ת��Ϊʮ������
     * decNum Ҫת����ʮ��������
     * return ת����ʮ�����Ƶ�����
     */
    public static String DecToHex(int decNum) {
        // 45 / 16��ȡ��
        String hex = "";//ת���õ�ʮ�������ַ���
        while(decNum != 0) {
            int temp = decNum % 16;
            //����������0-9֮������ֿ�����10-15֮�������
            if(temp >= 0 && temp <= 9) {
                hex = temp + hex;//��ǰƴ��
            }
            else if(temp >= 10 && temp <= 15) {
                //������ת��Ϊ�ַ�
                hex = (char)(temp  - 10 + 'A') + hex;
            }
            decNum /= 16;
        }
        return hex;
    }
    /**
     * ʮ������ת��Ϊʮ����
     * hexNum Ҫת����ʮ�������ַ���
     * return ׼���ɹ���ʮ��������
     */
    public static int HexToDec(String hex) {
        int decNum = 0;
        //6E -> 6 * 16 + 14 * 1
        //��Ҫ����16�����ַ��������ۼ�
        for (int i = 0; i < hex.length(); i++) {
            //ȡ���ַ����е�ÿһ���ַ������ж�
            char tempChar = hex.charAt(i);
            //�������,'0' - '9'    'A' - 'F'
            if(tempChar >= '0' && tempChar <= '9') {
                decNum += (tempChar - '0') * Math.pow(16, hex.length() - i - 1);
            }else if(tempChar >= 'A' && tempChar <= 'F') {
                decNum += (tempChar - 'A' + 10) * Math.pow(16, hex.length() - i - 1);
            }
        }
        return decNum;
    }
}