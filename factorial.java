public class factorial {
    public static int factorial1(int n){
        int f =1;
        for(int i = 1;i <= n; i++){
            f = f * i;

        }
        return f;

    }
    public static int bionomail( int n, int r){
        int factn=factorial1(n);
        int factr = factorial1(r);
        int factnr = factorial1(n-r);
        int biocoff= factn/(factr*factnr);
        return biocoff;
    }


    public static void main(String[] args) {
        System.out.println(bionomail(5,2));
    }

}

