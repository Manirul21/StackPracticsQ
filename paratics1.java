import java.util.Scanner;

public class paratics1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the you want print the days in a week ");
        int b = sc.nextInt();
        switch (b) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("thu");
                break;
            default:
                System.out.println("Invalid input");

        }

    }
}
