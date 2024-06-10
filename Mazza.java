public class Mazza {
    public static void max(int number[]){
        int tp=0;
        for(int i=0;i<number.length;i++){
            int beg=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                for(int k=beg;k<=end;k++){
                    System.out.print(number[k]+" ");

                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub array "+tp);
    }

    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        max(num);
    }
}
