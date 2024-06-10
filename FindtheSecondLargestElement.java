public class FindtheSecondLargestElement {
    public static void largest(int arr[]){
        int fast=0;
        int last=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>fast){
                fast=arr[i];
                last=fast;
            }
            else if(arr[i]>last && arr[i]!=fast){
                last=arr[i];
            }
        }
        System.out.println(last);
    }
    public static void main(String[] args) {
        int arr[]={10,5,3};
        largest(arr);

    }
}
