public class print_pair_of {
    public static void pair(int nuber[]){
        int count=0;
        for(int i=0;i<nuber.length;i++){
            int curr=nuber[i];
            for(int j=i+1;j<nuber.length;j++){
                System.out.print("("+curr+","+nuber[j]+")");
                count++;

            }

            System.out.println();
        }
        System.out.println("Total sunaray is:"+count);
    }

    public static void main(String[] args) {
        int number[]={2,4,6,8};
        pair(number);
    }

}
