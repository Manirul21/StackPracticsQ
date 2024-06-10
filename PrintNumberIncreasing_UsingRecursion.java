public class PrintNumberIncreasing_UsingRecursion {
    public static void printINc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;

        }
        printINc(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        int n=5;
        printINc(n);
    }
}
