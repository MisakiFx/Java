public class StudentB extends Student {
    public StudentB(String id, String classNum, String name, String sex, int age) {
        super(id, classNum, name, sex, age);
    }

    public String toString() {
        System.out.println("ѧ�ţ�" + getId() + "��" +  "�༶" +  getClassNum() + "��" + "������" + getName() + "��" + "�Ա�" + getSex() + "��" + "���䣺" + getAge());
        return super.toString();
    }
}
