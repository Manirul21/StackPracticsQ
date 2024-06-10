import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingInterleaving {
    public static void interleave(Queue<Integer>q){
        Queue<Integer>fasthalf=new LinkedList<>();
        int size=q.size();
        for(int i=0;i<size/2;i++){
            fasthalf.add(q.remove());
        }
        while (!fasthalf.isEmpty()){
            q.add(fasthalf.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        int j=1;
        for(int i=0;i<10;i++){
            q.add(j);
            j++;
        }
        interleave(q);
        while (!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println();

    }
}
