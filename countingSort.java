import java.util.LinkedList;
public class countingSort {
    public static void reverse(LinkedList<Integer>ll,int left,int right){
        Integer last=ll.getFirst();
        System.out.println(last);
        System.out.println(ll);

    }
    public static void main(String[] args) {
       LinkedList<Integer>ll=new LinkedList<>();
       ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        reverse(ll,1,5);


    }




    }

