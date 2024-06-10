public class Remove_Element {
    public static int remove(int arr[],int val){
        int count=0;
        for(int i=0;i<arr.length;i++ ){
            if(arr[i]==val){
                count++;
            }
        }
        return arr.length-count;
    }

    public static void main(String[] args) {
        int arr[]={0,1,2,2,3,0,4,2};
        int val=2;
        System.out.println(remove(arr,val));


    }
}
