public class Anmail {
    private String type;
    public Anmail(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Anmail{" +
                "type='" + type + '\'' +
                '}';
    }
    public void sound(String voice){
        System.out.println("叫声：" + voice);
    }
}
