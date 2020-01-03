public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isEven(){
        if (this.value % 2 == 0)
            return true;
        return false;
    }

    public boolean isOdd(){
        if (this.value % 2 != 0)
            return true;
        return false;
    }

    public boolean isPrime(){
        if( this.value ==1 || this.value %2 ==0 && this.value !=2 )
           return false;
        else
            for( int i =3; i< Math.sqrt(this.value); i+=2)
            {
                if( this.value % i == 0)
                {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(int x){
            if (this.value == x) return true;
            return false;
        }

        public Integer parseInt(String x){
            return Integer.parseInt(x);
        }
    }

