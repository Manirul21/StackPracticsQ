import java.sql.SQLOutput;
import java.util.Scanner;

public class linearq {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String manu[]= {"Mango","orange","Banana","Apple"};
        System.out.println("Enter the fruit name");
        String key= sc.nextLine();
        //String key= "Mango";
        int a=0;
        for(int i=0;i<manu.length;i++){
            if(manu[i].equals(key)){
                a++;

            }
        }
        if(a==0){
            System.out.println("it is not available");
        }
        else {
            System.out.println("it is available");
        }

    }
}
