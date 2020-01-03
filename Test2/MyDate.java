public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        this.year = 2008;
        this.month = 1;
        this.day = 1;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    public void showDate(){
        System.out.println(getYear() + "Äê" + getMonth() + "ÔÂ" + getDay() + "ÈÕ");
    }
}
