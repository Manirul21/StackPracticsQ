import java.util.ArrayList;

public class ArrayLIstCreationUsing {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        for (int i=0;i<10;i++){// Add Element On ArrayList
            list.add(i);

        }
        System.out.println(list);
        // Remove Element from ArrayList
      int c=  list.remove(4);
        System.out.println(c);
        System.out.println(list);
        // get Opreation On ArrayList
        System.out.println(list.get(5));
        // Set Opretion
        list.set(2,8);
        System.out.println(list);
        // Contain Method
         boolean d= list.contains(5);
        System.out.println(d);

    }
}
