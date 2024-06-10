public class findTheTargetIndex_UsingRecursion {
    public static int search(int arr[],int tar,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]<=tar){
            return mid;
        }
        //l1 mid on l1
        if(arr[si]<=arr[mid]){
            if(arr[si]<=tar && tar<=arr[mid]){
                //left part
                return search(arr,tar,si,mid-1);

            }
            else {
                // right part
                return search(arr,tar,mid+1,ei);
            }

        }
        // mid for l2
        else {
            //right part
            if(arr[mid]<=tar&& tar<=arr[ei]){
                return  search(arr,tar,mid+1,ei);
            }
            // left part
            else {
                return search(arr,tar,si,mid-1);

            }

        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,7,8,0,5};
        int indx=search(arr,0,0,arr.length-1);
        System.out.println(indx);

    }
}
