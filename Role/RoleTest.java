public class RoleTest {
    public static void main(String[] args) {
        Role role1 = new Role();
        role1.name = "劳拉";
        role1.level = 25;
        role1.job = "摸金";
        role1.DoSkill();
        Role role2 = null;
        role2 = new Role();// 相当于给role2分配了空间，不可或缺的一步
        role2.name = "孙悟空";
        role2.job = "神仙";
        role2.level = 99;
        role2.DoSkill();
        Role role3 = new Role();
        role3.name = "至尊宝";
        role3.DoSkill();
    }
}