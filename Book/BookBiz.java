public class BookBiz {
    /**
     * �����鼮
     * @param book �����鼮����
     * @return ���۳ɹ��������۵�������ʧ�ܷ���-1
     */
    public int SellBook(Book book) {
        //1���жϿ��
        //2��ͼ����-1
        //3���������۵�����
        if(!(book.GetCount() > 1)) {
            //����������
            return -1;
        }
        else {
            book.SetCount(book.GetCount() - 1);
            return 1;
        }
    }
}