public class separationOf0And1 {
    public static void  sep(int[] arr){
        int [] newarr=new int[arr.length];
        int j=0;
        for(int i=0;i< arr.length;i++){
            if (arr[i]==1){
                newarr[i]=arr[j];
                j++;
            }
            else {
                newarr[j]=arr[i];
                j++;
            }
        }
        System.out.println(" your new array is: ");
        for (int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,1,0,1,0};
        sep(arr);

    }
}
