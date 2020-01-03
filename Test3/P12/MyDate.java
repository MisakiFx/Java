public class MyDate {
    private Integer year;
    private Integer month;
    private Integer day;

    public String toString() {
        return "类名： " + this.getClass().getName() + "\t 日期: "
                + String.valueOf(year).concat(String.valueOf(month)) + String.valueOf(day);
    }
}
