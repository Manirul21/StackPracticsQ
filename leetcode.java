public class leetcode {
    public static int nums1(int nums[],int val){
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                index++;
                //continue;

            }
        }
        //int k=nums.length-index-1;
        return index;

    }

    public static void main(String[] args) {
        int arr[]={3,2,2,3};
        int val=3;
        int d=nums1(arr,val);
        System.out.println(d);
      int c=arr.length-d;
        System.out.println(c);

    }
}
