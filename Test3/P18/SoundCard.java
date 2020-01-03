public class SoundCard implements PCI{

    @Override
    public void start() {
        System.out.println("SoundCard start...");
    }

    @Override
    public void stop() {
        System.out.println("SoundCard stop!");
    }
}
