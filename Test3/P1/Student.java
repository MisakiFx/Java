public class Student extends Person {
    private String id;
    private String cname;
    private Double score;


    public Student(String name, String gender, Integer age, String id, String cname, Double score) {
        super(name, gender, age);
        this.id = id;
        this.cname = cname;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void display() {
        System.out.println("������" + getName());
        System.out.println("�Ա�" + getGender());
        System.out.println("���䣺" + getAge() + "��");
        System.out.println("ѧ�ţ�" + id);
        System.out.println("�༶��" + cname);
        System.out.println("�ɼ���" + score);
    }
}
