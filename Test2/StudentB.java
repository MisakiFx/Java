public class StudentB extends Student {
    public StudentB(String id, String classNum, String name, String sex, int age) {
        super(id, classNum, name, sex, age);
    }

    public String toString() {
        System.out.println("学号：" + getId() + "，" +  "班级" +  getClassNum() + "，" + "姓名：" + getName() + "，" + "性别：" + getSex() + "，" + "年龄：" + getAge());
        return super.toString();
    }
}
