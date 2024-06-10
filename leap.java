import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();
        if(year % 4 ==0) {
            System.out.println("this leap");
        } else if (year % 100 == 0) {

        } else if (year % 400 == 0) {
            System.out.println("leap");

        }
        else {
            System.out.println("not leap");

        }
    }
}
