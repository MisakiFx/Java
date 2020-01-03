public class 打印机监视器 {
    private boolean 墨盒用尽;
    private boolean 最后一次后打印过10万张纸;
    private boolean 需要维修(){
        return 墨盒用尽 || 最后一次后打印过10万张纸;
    }
}
