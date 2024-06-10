public class paratics5 {
    public static void sub(int number[]){
        int tp=0;
        for(int i=0;i<number.length;i++){
            int beg=i;
            for(int j=i;j<number.length;j++){
                int end= j;
                for(int k=beg;k<=end;k++){
                    System.out.print(k+" ");
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of subarray  " +tp);
    }

    public static void main(String[] args) {
        int number[]={2,5,6,8,9};
        sub(number);
    }
}
