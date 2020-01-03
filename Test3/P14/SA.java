public class SA {
    public int f(int a,int b){
        int i;
        if( a < b )
            i = a;
        else
            i = b;
        for( ;;i--){
            if(( a % i ) == 0 && ( b % i ) == 0)
                return i;
        }
    }
}
