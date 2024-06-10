import java.util.ArrayList;

public class ArrayListSwapTwoNumber {
    public static void swap(ArrayList<Integer>list,int index1,int index2){
        int tepm=list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2,tepm);

    }
    public static void main(String[] args) {
        int arr[]={6,8,51,5,8,9};
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        System.out.println(list);
        swap(list,1,3);
        System.out.println(list);
//        System.out.println(list.size());
//        list.add(67);
//        System.out.println(list.size());

    }
}
