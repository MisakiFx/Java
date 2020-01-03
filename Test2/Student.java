public class Student {
    private String id;
    private String classNum;
    private String name;
    private String sex;
    int age;

    public Student() {
       super();
    }

    public Student(String id, String classNum, String name, String sex, int age) {
        this.id = id;
        this.classNum = classNum;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getClassNum() {
        return classNum;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
