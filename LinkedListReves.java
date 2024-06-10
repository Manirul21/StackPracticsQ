import java.util.LinkedList;
import java.util.Stack;

public class LinkedListReves {
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        Stack<Integer>s=new Stack<>();
       int  i=0;
       while (i<ll.size()){
           s.push(ll.get(i));
           i++;
       }

       while (!s.isEmpty()){
           System.out.print(s.peek()+" ");
           s.pop();
       }

    }
}
