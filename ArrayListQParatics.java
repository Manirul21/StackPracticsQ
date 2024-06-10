import java.util.ArrayList;
import java.util.Collections;

public class ArrayListQParatics {
    public static void RemoveDup(ArrayList<Integer>list){
        Collections.sort(list);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)==list.get(i+1)){
                list.remove(list.get(i));
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={6,2,2,6,8,7};
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);

        }
        RemoveDup(list);

    }
}
