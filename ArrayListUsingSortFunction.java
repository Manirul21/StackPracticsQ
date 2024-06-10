import java.util.ArrayList;
import java.util.Collections;

public class ArrayListUsingSortFunction {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(42);
        list.add(14);
        list.add(3);
        System.out.println(list);
        Collections.sort(list);
        // Ascending Order Sorting
        System.out.println(list);
       // descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }

}
