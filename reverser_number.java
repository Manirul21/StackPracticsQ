public class reverser_number {
    public static void main(String[] args) {
        int rev = 0;
        int n = 121;
        while (n>0){
            int lastdigit = n%10;
            rev = (rev * 10)+ lastdigit;
            n=n/10;
        }
        System.out.println(rev);
    }
}
