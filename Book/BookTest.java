public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Misaki", "123-321", 98, 5);
        //ʵ����ͼ��ҵ�����
        BookBiz bookBiz = new BookBiz();
        //����� - 1
        bookBiz.SellBook(book);
        System.out.println(book.GetCount());
    }
}