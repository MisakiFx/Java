public class Person {
    private String name;
    private String address;
    private String phoneNum;
    private String email;

    public Person() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "������" + this.getClass().getName() + "\t" + "������" +  getName();
    }
}
