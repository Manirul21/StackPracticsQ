public class invert_pattern{
    public static void main(String[] args) {
        for( int i =1;i<=4;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for (int z=1;z<=i;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

