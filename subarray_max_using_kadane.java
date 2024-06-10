public class subarray_max_using_kadane {
    public static void max(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currsum=currsum+arr[i];
            maxsum=Math.max(maxsum,currsum);
            if(currsum<0){
                currsum=0;
            }
        }
        System.out.println("max subarray is "+maxsum);

    }

    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,1,5,-3};
        max(arr);
    }
}
