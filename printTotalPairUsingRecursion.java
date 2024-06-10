public class printTotalPairUsingRecursion {
    public static int pair(int n) {
        if (n == 1 || n == 2) {
            return n;

        }


//        int signal = pair(n - 1);
//        int pair1 = pair(n - 2);
//        return signal + (n - 1) * pair1;
        return pair(n-1)+(n-1)*pair(n-2);
    }

    public static void main(String[] args) {
        System.out.println(pair(3));
    }
}
