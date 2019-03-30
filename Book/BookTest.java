public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Misaki", "123-321", 98, 5);
        //实例化图书业务对象
        BookBiz bookBiz = new BookBiz();
        //库存量 - 1
        bookBiz.SellBook(book);
        System.out.println(book.GetCount());
    }
}