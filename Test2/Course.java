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
        System.out.println("�γ̱�ţ�" + this.cNnumber + "\n" + "�γ����ƣ�" + this.Cname + "\n" + "ѧ�֣�" + this.Cuit );
    }
}
