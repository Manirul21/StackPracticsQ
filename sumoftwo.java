public class sumoftwo {
    public static int[] twoarray(int arr[], int target){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+arr[i+1]==target){
               return new int[]{i,i+1};
            }
        }

        return new int[]{0};
    }

    public static void main(String[] args) {
        int arr[]={3,4,9,5,2,6};
        int key=0;
      int n[] = twoarray(arr,key);
       for(int i=0;i<n.length;i++){
           System.out.print("["+i+"]");
       }
    }
}

