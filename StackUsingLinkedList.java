public class StackUsingLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    static class stack{
        static Node head=null;
        public static boolean isepmty(){
            return head==null;
        }
        // push
        public static void push(int data){
            Node newnode=new Node(data);
            if(isepmty()){
                head=newnode;
                return;
            }
            head.next=newnode;
            head=newnode;

        }
        public static int pop(){
            if(isepmty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;

        }
        public static int peek(){
            if(isepmty()){
                return -1;
            }
            return head.data;
        }
        
    }

    public static void main(String[] args) {
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isepmty()){
            System.out.println(s.peek());
            s.pop();

        }


    }
}
