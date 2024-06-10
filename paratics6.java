public class paratics6 {
    public static void sumOfTwoSubArray(int arr[],int arr1[]){

        for(int i=0;i<arr.length;i++){
            int sum= arr[i]+arr1[i];
            System.out.print(sum+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={5,6,8,7};
        int arr1[]={5,8,5,6,};
        sumOfTwoSubArray(arr,arr1);

    }
}
