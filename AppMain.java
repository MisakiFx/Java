import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /** 后宫娘娘的姓名数组，预留五个空间 */
        String[] nnNameArray = {"未来", "Misaki", "六花", "千代", "阎魔爱", "", "", "", "", ""};
        /** 级别数组 */
        String[] levalNames = {"贵人", "嫔妃", "贵妃", "皇贵妃", "皇后"};
        /** 对应每个娘娘的级别 */
        int[] level = new int[10];
        /** 对应每个娘娘的好感度 */
        int[] loves = new int[10];
        /** 娘娘的出事数量为5 */
        int nnCount = 5;
        int gameDays = 1;//游戏默认运行10天
        //设定默认好感度
        for (int i = 0; i < nnCount; i++) {
            loves[i] = 100;
        }
        while(gameDays <= 10){
            System.out.println("游戏进行到第" + gameDays + "天");
            System.out.println("1、皇帝下旨选妃\t\t");
            System.out.println("2、翻牌宠幸");
            System.out.println("3、打入冷宫");
            System.out.println("4、召见爱妃");
            System.out.print("陛下请选择：");
            int choice = input.nextInt();
            switch(choice) {
                case 1: //1、增加
                    if(nnCount == nnNameArray.length) {
                        System.out.println("皇帝陛下，后宫满了！！！");
                        break;
                    }
                    System.out.print("请输入娘娘的名字：");
                    String newName = input.next();
                    //增加：姓名数组，好感度数组，级别数组，总数+1
                    nnNameArray[nnCount] = newName;
                    loves[nnCount] = 100;
                    //其他人好感度-10
                    for (int i = 0; i < nnCount; i++) {
                        loves[i] -= 10;
                    }
                    nnCount++;
                    break;
                case 2://2、修改状态，翻牌人好感度+20，其他人-10
                    System.out.println("请输入娘娘的名字：");
                    String name = input.next();
                    //查找
                    int searchIndex = -1;//要查找的字符串下标
                    for (int i = 0; i < nnCount; i++) {
                        if(name.compareTo(nnNameArray[i]) == 0) {
                            //姓名相等的情况
                            searchIndex = i;
                            break;
                        }
                    }
                    if(searchIndex == -1) {//没找到
                        System.out.println("陛下，未曾拥有这位妻子！");
                        break;
                    }
                    //找到的情况：更改好感度，并且升级
                    loves[searchIndex] += 20;
                    if(level[searchIndex] == levalNames.length - 1) {
                        System.out.println(nnNameArray[searchIndex] + "已经满级，无法升级！宠幸失败！");
                        //loves[searchIndex] -= 10;
                        break;
                    }
                    level[searchIndex] += 1;
                    for (int i = 0; i < nnCount; i++) {
                        if(i == searchIndex) {
                            continue;
                        }
                        loves[i] -= 10;
                    }
                    System.out.println("宠幸" + nnNameArray[searchIndex] + "，好感度 + 20，升级为" + levalNames[level[searchIndex]] + "，其他娘娘好感度 - 10");
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("必须输入1-4之间的整数!");
                    continue;
            }
            System.out.println("姓名\t级别\t好感度");
            for (int i = 0; i < nnCount; i++) {
                System.out.println(nnNameArray[i] + "\t" + levalNames[level[i]] + "\t" + loves[i]);
            }
            gameDays++;
        }
    }
}