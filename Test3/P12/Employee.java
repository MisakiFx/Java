public class Employee extends Person{
    private String ofice;
    private Double salary;
    private MyDate hireDay;
    private String officeHour;
    private String level;
    private String dutyName;

    @Override
    public String toString() {
        return "������" + this.getClass().getName() + "\t" + "������" +  getName();
    }
}
