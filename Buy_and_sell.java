public class Buy_and_sell {
    public static int buysell(int arr[]){
        int buy=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<arr.length;i++){
            if(buy<arr[0]){
                int profit=arr[i]-buy;
                maxprofit=Math.max(profit,maxprofit);
            }
            else {
                buy=arr[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(buysell(arr));
    }
}
