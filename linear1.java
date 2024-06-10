import java.util.Scanner;

public class linear1 {
    public static int search(String manu[],String key){

        for(int i=0;i<manu.length;i++){
            if (manu[i]==key){
                return i;

            }
        }
        return -1;

    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String manu[]={"Mango","Banana","Apple","Orange"};
        System.out.println("Entre The fruit name :");
        String k =sc.nextLine();
        int index=search(manu,k);
        if(index==-1){
            System.out.println(k+ "Not available ");
        }
        else {
            System.out.println(k+  " is available");
        }
    }
}
