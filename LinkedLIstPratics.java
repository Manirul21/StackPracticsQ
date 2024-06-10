import java.util.LinkedList;

public class LinkedLIstPratics {
    public static void main(String[] args) {
      LinkedList<Integer>ll=new LinkedList<>();
      ll.addFirst(2);
      ll.addFirst(2);
      ll.addFirst(2);
      int i=0;
      int count=0;
      int sum=0;
      int size=ll.size();
      while (i<ll.size()){
          int c=ll.get(i);
          sum+=c;
          if(c%2==0){
              count++;
          }
          i++;
      }
        if(size==count){
            System.out.println("The LinkedList Even");
        }
        else {
            System.out.println("The LinkedList is not Even");
        }

        System.out.println("Sum of LinkedList is:"+sum);
    }
}
