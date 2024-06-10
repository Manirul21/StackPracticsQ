public class PrintSumNaturalNumber_UsingRecursion {
    public static int calSum(int n){
        if(n==1){
            return 1;
        }
//        int as=calSum(n-1);
//        int ab=n+as;
//        return ab;
        return n+calSum(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(calSum(n));
    }
}
