public class _3SumProble {
    public static void sum3(int arr[], int taraget){
        int left=0;
        int mid=1;
        int right=2;
        boolean found=false;
        while(right<arr.length) {
            if (arr[left] + arr[mid] + arr[right] == taraget) {
                System.out.print(arr[left]+" "+arr[mid]+" "+arr[right]);
                found=true;
                break;

            }
            if(right==arr.length-1){
                left++;
                mid++;
                right=mid+1;
            }
            else {
                right++;
            }

        }
        if (!found){
            System.out.println("not founnded");
        }

    }

    public static void main(String[] args) {
        int arr[]={2,0,5,6,8,5,9};
        sum3(arr,22);

    }
}
