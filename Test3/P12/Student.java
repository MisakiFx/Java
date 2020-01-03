public class Student extends Person{
    private static final String GRADE_ONE = "一";
    private static final String GRADE_TWO = "二";
    private static final String GRADE_THREE = "三";
    private static final String GRADE_FOUR = "四";
    @Override
    public String toString() {
        return "类名：" + this.getClass().getName() + "\t" + "姓名：" +  getName();
    }
}
