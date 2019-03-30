public class BookBiz {
    /**
     * 销售书籍
     * @param book 销售书籍对象
     * @return 销售成功返回销售的数量，失败返回-1
     */
    public int SellBook(Book book) {
        //1、判断库存
        //2、图书库存-1
        //3、返回销售的数量
        if(!(book.GetCount() > 1)) {
            //不可以销售
            return -1;
        }
        else {
            book.SetCount(book.GetCount() - 1);
            return 1;
        }
    }
}