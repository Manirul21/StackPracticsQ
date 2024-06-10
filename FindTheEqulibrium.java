public class FindTheEqulibrium {
    public static int equlibrium(int arr[]){
        int left=0;
        int right=arr.length-1;
        int point=-1;
        int letsum=0;
        int rightsum=0;
        while (left<right){
            letsum+=arr[left];
           rightsum+=arr[right];

           if(letsum==rightsum){
               point=arr[left+1];
              return point;
           }
           if(letsum>rightsum){
               right--;
           }
           else {
               left++;
           }

        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[]={1,3,3,4};
        System.out.println(equlibrium(arr));
    }
}
