public class MyDate {
    private Integer year;
    private Integer month;
    private Integer day;

    public String toString() {
        return "������ " + this.getClass().getName() + "\t ����: "
                + String.valueOf(year).concat(String.valueOf(month)) + String.valueOf(day);
    }
}
