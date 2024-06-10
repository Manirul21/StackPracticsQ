public class subarray_using_prefix {
    public static void max(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int [arr.length];
        prefix[0]=arr[0];
        //calculate prefix array
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int j=0;j<arr.length;j++){
            int start=j;
            for (int k=1;k<arr.length;k++){
                int end=k;
                //currsum
                currsum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("max"+maxsum);
    }

    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        max(arr);
    }
}
