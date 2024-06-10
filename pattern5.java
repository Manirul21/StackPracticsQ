public class pattern5 {
    public static void main(String[] args) {
        for(int i=0;i<7;i++){
            for(int j=i;j<7-1;j++){
                System.out.print(" ");

            }
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }

}
