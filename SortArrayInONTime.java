public class SortArrayInONTime {
    public static void Print(int arr[]){
        int left=0;
        int right=0;
        while (right<arr.length){
            if(arr[left]>arr[right]){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
            if(right==arr.length-1){
                left++;
                right=left;
            }
            right++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={6,2,5,1,9,6,4};
        Print(arr);
    }
}
