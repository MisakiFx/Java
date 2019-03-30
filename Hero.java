public class Hero {
    String name = "默认值";
    public void test1() {
        String name = "Misaki";//和C一样，局部变量优先级大于成员变量大于全局变量
        System.out.println(name);
    }
    public static void main(String[] args) {
        new Hero().test1();
    }
}