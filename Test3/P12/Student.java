public class Student extends Person{
    private static final String GRADE_ONE = "һ";
    private static final String GRADE_TWO = "��";
    private static final String GRADE_THREE = "��";
    private static final String GRADE_FOUR = "��";
    @Override
    public String toString() {
        return "������" + this.getClass().getName() + "\t" + "������" +  getName();
    }
}
