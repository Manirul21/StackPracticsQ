public class BacktrackingUsingGridOptimizeSolution {
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static int grid(int n,int m) {
        int f1 = fact(n - 1 + m - 1);
        int f2 = fact(n - 1);
        int f3 = fact( m- 1);
        return f1 / (f2 * f3);
    }

    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(grid(n,m));



    }
}
