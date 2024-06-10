public class subarrayprint {
    public static void subarray(int number[]){
       // int tps=0;
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            int start = i;
            for(int j=i;j<number.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                   // System.out.print(number[k]+" ");
                    curr+=number[k];

                }
                if(max<curr)
                    max=curr;
                System.out.println(max);
            }
            System.out.println();
        }
       // System.out.println("Total subarray"+tps);
    }

    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        subarray(number);
    }
}
