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
    }
}