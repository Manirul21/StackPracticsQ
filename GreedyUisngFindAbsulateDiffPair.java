import java.util.Arrays;

public class GreedyUisngFindAbsulateDiffPair {
    public static void main(String[] args) {
        int arr[]={4,1,8,7};
        int arr1[]={2,3,6,5};
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int diffsol=0;
        for(int i=0;i<arr1.length;i++){
            diffsol+=Math.abs(arr[i]-arr1[i]);
        }
        System.out.println("The absolute diff is   "+diffsol);
    }
}
