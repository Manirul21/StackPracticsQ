import java.util.Scanner;

public class array_input_output {
    public static void main(String[] args) {
        //input the element in array
        int marks[]=new int[50];
        Scanner sc = new Scanner(System.in);
        marks[0]=sc.nextInt();//phy
        marks[1]= sc.nextInt();//che
        marks[2]= sc.nextInt();//math
        //output the array
        System.out.println("Phy"+marks[0]);
        System.out.println("che"+marks[1]);
        System.out.println("Math"+marks[2]);
        //update array
       // marks[0]=100;
        System.out.println("Phy"+marks[0]);
        //length of array
        System.out.println(marks.length);
        //calculate the average in three subject
        int per=(marks[0]+marks[2]+marks[1])/3;
        System.out.println("precentage of "+per+"%");

    }
}
