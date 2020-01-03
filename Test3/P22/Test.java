public class Test {

    public static void main(String[] args) {
        Giede giede = new Giede();
        giede.sound("老鹰叫");
        System.out.println("飞行速度：" + giede.flySpeed() + "km/h");
        Pigeon pigeon = new Pigeon();
        pigeon.sound("咕咕");
        System.out.println("飞行速度：" + pigeon.flySpeed() + "km/h");
    }
}
