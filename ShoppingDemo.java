import java.util.Scanner;
/**
 * 2019.2.8
 * 计算商品总价，如果价格高于50000打7折，否则打9折
 * 打印商品总价
 */
public class ShoppingDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //输入商品价格及数量
        double price, total;//价格，总价
        int count;//数量
        System.out.print("请输入路易斯威登中号手表的单价：");
        price = input.nextDouble();//接收
        System.out.print("请输入商品的数量");
        count = input.nextInt();
        total = price * count;//计算总价
        System.out.print("请输入爱马仕时尚休闲皮带的单价：");
        price = input.nextDouble();//接收
        System.out.print("请输入商品的数量");
        count = input.nextInt();
        total += price * count;//计算累加的总价
        System.out.print("请输入香奈儿东方屏风香水的单价：");
        price = input.nextDouble();//接收
        System.out.print("请输入商品的数量");
        count = input.nextInt(); 
        total += price * count;//计算累加的总价
        //2、计算总价
        //3、根据总价判断是否打折
        if(total >= 50000)
        {
            total *= 0.7;
        }
        else
        {
            total *= 0.9;
        }
        //4、打印打折后应付的金额
        System.out.println("应当付的总金额为：" + total);
    }
}