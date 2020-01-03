
public class Pigeon extends Anmail implements Flyable {
    public Pigeon() {
        super("鸽子");
    }
    @Override
    public double flySpeed() {
        return 110;
    }
}
