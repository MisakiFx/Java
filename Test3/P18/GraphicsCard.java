public class GraphicsCard implements PCI{

    @Override
    public void start() {
        System.out.println("GraphicsCard start...");
    }

    @Override
    public void stop() {
        System.out.println("GraphicsCard stop!");
    }
}
