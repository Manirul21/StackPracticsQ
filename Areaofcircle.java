import java.util.Scanner;

public class Areaofcircle {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius of a circle");
                float a= sc.nextFloat();
                float  area= 3.14f* a*a;
        System.out.println("The area of circle is ");
        System.out.println(area);

    }
}
