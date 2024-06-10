public class paratisc2 {
    public static int binary(int number[],int key){
        int start=1;
        int end= number.length;
        while (start<end){
            int mid = (start+end)/2;
            if(number[mid]==key){
                return mid;
            }
            if(mid<key) {
                start = mid + 1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[]={2,6,8,9,71};
        int key=8;
      int index=  binary(number,key);
      if(index==-1){
          System.out.println("Element is not founded in Array are: "+key);
      }
      else {
          System.out.println("Element is founded in Array are : ");
      }
    }

}
