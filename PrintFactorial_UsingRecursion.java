public class PrintFactorial_UsingRecursion {
    public static int printFact(int n){
        if(n==0){
            return 1;
        }
//        int fact=printFact(n-1);
//        int ft=n*fact;
//        return ft;
        return n*printFact(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(printFact(n));
    }
}
