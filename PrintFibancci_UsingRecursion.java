public class PrintFibancci_UsingRecursion {
    public static int fib(int n){
        if(n==0||n==1){
            return n;

        }
        int f1=fib(n-1);
        int f2=fib(n-2);
        int f3=f1+f2;
        return f3;
    }

    public static void main(String[] args) {
        int n=6;
        System.out.println(fib(n));
    }
}
