public class binaryTodecimal {
    public static  void binTodec(int n){
        int num=n;
        int pow=0;
        int dec = 0;
        while (n>0){
            int lastnumber= n%10;
            dec=dec+(lastnumber*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println("Decimal of " + num + "=" + dec);
    }

    public static void main(String[] args) {
        binTodec(111);
    }
}
