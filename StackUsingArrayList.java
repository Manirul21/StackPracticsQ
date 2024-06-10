import java.util.ArrayList;

public class StackUsingArrayList {
    static class stack{
        static ArrayList<Integer>list=new ArrayList<>();
        public static boolean isempty(){
            return list.size()-1==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            return list.get(list.size()-1);
        }

    }

    public static void main(String[] args) {
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isempty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
