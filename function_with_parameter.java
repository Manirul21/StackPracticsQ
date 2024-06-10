import java.util.Scanner;

public class function_with_parameter {
    public static int sumoftwo(int a,int b){
        int sum=a+b;
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a= sc.nextInt();
        System.out.println("Enter the value of B");
        int b=sc.nextInt();
        int sum=sumoftwo(a,b);
        System.out.println("Sum of two numbers = "+sum);
    }
}
