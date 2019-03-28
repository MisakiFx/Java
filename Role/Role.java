/**
 * 
 */
public class Role {
    //名称：劳拉
    //等级：25
    //职业：考古学家
    //技能：双枪
    /**名称 */
    public String name;
    /**等级 */
    public int level;
    /**职业 */
    public String job;
    /**默认构造  */
    public Role() {}
    /**
     * 构造方法/构造器
     * 1、没有返回值
     * 2、方法名和类名一致
     */
    public Role(String name1, int level1, String job1) {
        name = name1;
        level = level1;
        job = job1;
    }
    /**打印当前对象的所有信息 */
    public void Show() {
        System.out.println(name + "\t" + level + "\t" + job);
    }
    /**
     * 释放技能
     */
    public void DoSkill() {
        if(name.equals("劳拉")) {
            System.out.println("双枪老太婆");
        }
        else if(name.equals("孙悟空")) {
            System.out.println("吃俺老孙一棒");
        }
        else {
            System.out.println("致命一击");
        }
    }
}