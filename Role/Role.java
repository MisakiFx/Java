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
    /**Ĭ�Ϲ���  */
    public Role() {}
    /**
     * ���췽��/������
     * 1��û�з���ֵ
     * 2��������������һ��
     */
    public Role(String name1, int level1, String job1) {
        name = name1;
        level = level1;
        job = job1;
    }
    /**��ӡ��ǰ�����������Ϣ */
    public void Show() {
        System.out.println(name + "\t" + level + "\t" + job);
    }
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
        else {
            System.out.println("����һ��");
        }
    }
}