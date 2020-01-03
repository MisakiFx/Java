public class NetworkCard implements PCI {

    @Override
    public void start() {
        System.out.println("NetworkCard start...");
    }

    @Override
    public void stop() {
        System.out.println("NetworkCard stop!");
    }
}
