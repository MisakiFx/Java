public class SB extends SA{
    @Override
    public int f(int a, int b) {
        int m = super.f(a, b);
        return (a*b)/m;
    }
}
