public class RoleTest {
    public static void main(String[] args) {
        Role role1 = new Role();
        role1.name = "����";
        role1.level = 25;
        role1.job = "����";
        role1.DoSkill();
        Role role2 = null;
        role2 = new Role();// �൱�ڸ�role2�����˿ռ䣬���ɻ�ȱ��һ��
        role2.name = "�����";
        role2.job = "����";
        role2.level = 99;
        role2.DoSkill();
        Role role3 = new Role();
        role3.name = "����";
        role3.DoSkill();
    }
}