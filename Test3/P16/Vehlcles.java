public class Vehlcles {
    private String size;
    private String color;
    private Integer seats;

    public Vehlcles(String size, String color, Integer seats) {
        this.size = size;
        this.color = color;
        this.seats = seats;
    }

    public void display() {
        System.out.println( "Vehlcles{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", seats=" + seats +
                '}');
    }
}
