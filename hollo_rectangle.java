public class hollo_rectangle {
    public static void rectangle(int rowtot,int coltot){
        for(int i=1;i<=rowtot;i++){
            for(int j=1;j<=coltot;j++){
                if(i==1||i==rowtot||j==1||j==coltot){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rectangle(4,5);
    }
}
