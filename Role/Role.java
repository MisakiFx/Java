/**
 * 
 */
public class Role {
    //���ƣ�����
    //�ȼ���25
    //ְҵ������ѧ��
    //���ܣ�˫ǹ
    /**���� */
    public String name;
    /**�ȼ� */
    public int level;
    /**ְҵ */
    public String job;
    /**
     * �ͷż���
     */
    public void DoSkill() {
        if(name.equals("����")) {
            System.out.println("˫ǹ��̫��");
        }
        else if(name.equals("�����")) {
            System.out.println("�԰�����һ��");
        }
    }
}