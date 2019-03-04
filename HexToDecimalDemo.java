import java.util.Scanner;

/**
 * 十六进制呵十进制之间的转换
 */
public class HexToDecimalDemo {
    public static void main(String[] args) {
    //1、让用户输入一个十进制数字
    Scanner input = new Scanner(System.in);
    System.out.print("请输入一个整型数字：");
    int decNum = input.nextInt();
    //2、使用方法让十进制转换为十六进制
    System.out.println(DecToHex(decNum));
    //3、再将十六进制数字换回十进制
    System.out.println(HexToDec(DecToHex(decNum)));
    }
    /**
     * 调用方法将十进制转换为十六进制
     * decNum 要转换的十进制数字
     * return 转换成十六进制的数字
     */
    public static String DecToHex(int decNum) {
        // 45 / 16反取余
        String hex = "";//转换好的十六进制字符串
        while(decNum != 0) {
            int temp = decNum % 16;
            //于数可能是0-9之间的数字可能是10-15之间的数字
            if(temp >= 0 && temp <= 9) {
                hex = temp + hex;//向前拼接
            }
            else if(temp >= 10 && temp <= 15) {
                //把数字转换为字符
                hex = (char)(temp  - 10 + 'A') + hex;
            }
            decNum /= 16;
        }
        return hex;
    }
    /**
     * 十六进制转换为十进制
     * hexNum 要转换的十六进制字符串
     * return 准换成功的十进制数字
     */
    public static int HexToDec(String hex) {
        int decNum = 0;
        //6E -> 6 * 16 + 14 * 1
        //需要遍历16进制字符串进行累加
        for (int i = 0; i < hex.length(); i++) {
            //取出字符串中的每一个字符进行判断
            char tempChar = hex.charAt(i);
            //两种情况,'0' - '9'    'A' - 'F'
            if(tempChar >= '0' && tempChar <= '9') {
                decNum += (tempChar - '0') * Math.pow(16, hex.length() - i - 1);
            }else if(tempChar >= 'A' && tempChar <= 'F') {
                decNum += (tempChar - 'A' + 10) * Math.pow(16, hex.length() - i - 1);
            }
        }
        return decNum;
    }
}