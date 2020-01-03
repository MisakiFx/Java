public class Employee extends Person{
    private String ofice;
    private Double salary;
    private MyDate hireDay;
    private String officeHour;
    private String level;
    private String dutyName;

    @Override
    public String toString() {
        return "ÀàÃû£º" + this.getClass().getName() + "\t" + "ĞÕÃû£º" +  getName();
    }
}
