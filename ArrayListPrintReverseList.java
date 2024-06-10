import java.util.ArrayList;

public class ArrayListPrintReverseList {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        for (int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    }

}
