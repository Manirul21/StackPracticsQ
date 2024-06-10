public class primenuber {
    public static boolean isprime( int n){
        for(int i = 2; i<= Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }

        }

        return true;
    }
    public static void primeInrang(int n){
        for(int i=2;i<=n;i++)
        if (isprime(i)){
            System.out.println(i+"");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        primeInrang(100);
    }
}
