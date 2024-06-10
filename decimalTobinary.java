public class decimalTobinary {
    public static void decTobin(int n){
        int b=n;
        int pow=0;
        int binary = 0;
        while (n>0){
            int rem= n%2;
            binary= binary+ (rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("The binary of "+ b +  "is"   +  binary);

    }

    public static void main(String[] args) {
        decTobin(7);
    }

}
