import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 2;
        if (a==b){
            System.out.print("The number is prime");
        }
        while (b < a) {
            if (a % b == 0) {
                System.out.println("not prime number");

            }
            else {
                b = b + 1;
                System.out.println("the number is prime number");
            }
        }
    }
}
