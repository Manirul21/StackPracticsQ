public class binary_search {
    public static void main(String[] args) {
        int[] number = {10, 20, 30, 40, 50, 60};
        int key =60;
       int index= binary(number,key);
       if(index==-1){
           System.out.println("Element is not founded");
       }
       else {

           System.out.println("Element is founded");
       }



    }
    public static int binary(int[]num,int key){
        int start=1,end=num.length;
        while (start<end){
            int mid=(start+end)/2;
            if (num[mid]==key){
                return mid;
            }
            if(mid<key){
                start=mid+1;
            }
            else {
                end=mid-1;
            }


        }
        return -1;

    }
}
