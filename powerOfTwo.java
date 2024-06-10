public class powerOfTwo {
    public static boolean powerOftwoin(int n){
        return (n&(n-1))==0;

    }

    public static void main(String[] args) {
        System.out.println(powerOftwoin(8));
    }
}
