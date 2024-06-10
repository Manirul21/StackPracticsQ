import java.util.ArrayList;
import java.util.Collections;

public class gfgQfindLeadderOfArray {
    public static void findleadder(int arr[],int n){
        ArrayList<Integer>ll=new ArrayList<>();
        int maxright=arr[n-1];
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=maxright){
                ll.add(arr[i]);
                maxright=arr[i];
            }
        }
        Collections.reverse(ll);
        System.out.println(ll);

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,5,0};
        findleadder(arr,5);
    }
}
