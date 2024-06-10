public class PrintFirstOccurenceOFAraay_usingRecursion {
    public static int FistOccurence(int[] arr, int key, int i){
        int n=arr.length;
        int j=i;
        if(j==n){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FistOccurence(arr,key,j+1);
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,6};
        System.out.println(FistOccurence(arr,6,0));
    }
}
