//public class addOR {
//    public static void main(String[] args) {
////      int a=7;
////     int b=6;
////       int sum=a|b;
////       System.out.println(sum);
//        System.out.println(4^2);
//  }
//}
public class addOR {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int sum = add(a, b);
        System.out.println(sum);
    }

    public static int add(int a, int b) {
        // If there's no carry left, return the sum
        if (b == 0) {
            return a;
        } else {
            // Calculate sum without carry
            int sum = a ^ b;
            // Calculate carry and recursively call add method
            int carry = (a & b) << 1;
            return add(sum, carry);
        }
    }
}
