public class Course {
    private String cNnumber;
    private String Cname;
    private double Cuit;

    public Course(String cNnumber, String cname, double cuit) {
        this.cNnumber = cNnumber;
        this.Cname = cname;
        this.Cuit = cuit;
    }

    public void printCourseInfo(){
        System.out.println("课程编号：" + this.cNnumber + "\n" + "课程名称：" + this.Cname + "\n" + "学分：" + this.Cuit );
    }
}
