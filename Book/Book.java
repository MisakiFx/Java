public class Book {
    private String name;
    private String isbn;
    private double price;
    private int count;
    private boolean borrow;
    public Book() {}
    public Book(String name) {
        this.SetName(name);
    }
    public Book(String name, String isbn, double price, int count) {
        this.SetName(name);
        this.SetIsbn(isbn);
        this.SetPrice(price);
        this.SetCount(count);
    }
    public boolean GetBorrow() {
        return borrow;
    }
    public void IsBorrow(boolean borrow) {
        this.borrow = borrow;
    }
    public String GetName() {
        return name;        
    }
    public void SetName(String name) {
        this.name = name;
    }
    public String GetIsbn() {
        return isbn;
    }
    public void SetIsbn(String isbn) {
        this.isbn = isbn;
    }
    public double GetPrice() {
        return price;
    }
    public void SetPrice(double price) {
        this.price = price;
    }
    public int GetCount() {
        return count;
    }
    public void SetCount(int count) {
        if(count < 0 ) {
            count = 0;
        }
        else {
        this.count = count;
        }
    }
}