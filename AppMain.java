import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /** ��������������飬Ԥ������ռ� */
        String[] nnNameArray = {"δ��", "Misaki", "����", "ǧ��", "��ħ��", "", "", "", "", ""};
        /** �������� */
        String[] levalNames = {"����", "����", "����", "�ʹ���", "�ʺ�"};
        /** ��Ӧÿ������ļ��� */
        int[] level = new int[10];
        /** ��Ӧÿ������ĺøж� */
        int[] loves = new int[10];
        /** ����ĳ�������Ϊ5 */
        int nnCount = 5;
        int gameDays = 1;//��ϷĬ������10��
        //�趨Ĭ�Ϻøж�
        for (int i = 0; i < nnCount; i++) {
            loves[i] = 100;
        }
        while(gameDays <= 10){
            System.out.println("��Ϸ���е���" + gameDays + "��");
            System.out.println("1���ʵ���ּѡ��\t\t");
            System.out.println("2�����Ƴ���");
            System.out.println("3�������乬");
            System.out.println("4���ټ�����");
            System.out.print("������ѡ��");
            int choice = input.nextInt();
            switch(choice) {
                case 1: //1������
                    if(nnCount == nnNameArray.length) {
                        System.out.println("�ʵ۱��£������ˣ�����");
                        break;
                    }
                    System.out.print("��������������֣�");
                    String newName = input.next();
                    //���ӣ��������飬�øж����飬�������飬����+1
                    nnNameArray[nnCount] = newName;
                    loves[nnCount] = 100;
                    //�����˺øж�-10
                    for (int i = 0; i < nnCount; i++) {
                        loves[i] -= 10;
                    }
                    nnCount++;
                    break;
                case 2://2���޸�״̬�������˺øж�+20��������-10
                    System.out.println("��������������֣�");
                    String name = input.next();
                    //����
                    int searchIndex = -1;//Ҫ���ҵ��ַ����±�
                    for (int i = 0; i < nnCount; i++) {
                        if(name.compareTo(nnNameArray[i]) == 0) {
                            //������ȵ����
                            searchIndex = i;
                            break;
                        }
                    }
                    if(searchIndex == -1) {//û�ҵ�
                        System.out.println("���£�δ��ӵ����λ���ӣ�");
                        break;
                    }
                    //�ҵ�����������ĺøжȣ���������
                    loves[searchIndex] += 20;
                    if(level[searchIndex] == levalNames.length - 1) {
                        System.out.println(nnNameArray[searchIndex] + "�Ѿ��������޷�����������ʧ�ܣ�");
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
                    System.out.println("����" + nnNameArray[searchIndex] + "���øж� + 20������Ϊ" + levalNames[level[searchIndex]] + "����������øж� - 10");
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("��������1-4֮�������!");
                    continue;
            }
            System.out.println("����\t����\t�øж�");
            for (int i = 0; i < nnCount; i++) {
                System.out.println(nnNameArray[i] + "\t" + levalNames[level[i]] + "\t" + loves[i]);
            }
            gameDays++;
        }
    }
}