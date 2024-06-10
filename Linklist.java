public class Linklist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }
        public static Node head;
        public static Node tail;
        public static int size;
        public void addFast(int data){
            Node newnode=new Node(data);
            size++;
            if(head==null){
                head=tail=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;

        }
        public void addlast(int data){
            Node newnode=new Node(data);
            size++;
            if(head==null){
                head=tail=null;
                return;
            }
            tail.next=newnode;
            tail=newnode;

        }
        public void print(){
            if(head==null){
                System.out.println("ll Is Empty");
                return;
            }
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+"--->");
                temp=temp.next;
            }
            System.out.println("null");

        }
        public void addmiddle(int indx,int data){
            Node newmode=new Node(data);
            size++;
            if(indx==0){
                addFast(data);
                return;
            }
            Node temp=head;
            int i=0;
            while (i<indx-1) {
                temp = temp.next;
                i++;
            }
            newmode.next=temp.next;
            temp.next=newmode;


        }
        public int serch(int key){
            Node temp=head;
            int i=0;
            while (temp!=null) {
                if (temp.data == key) {
                    return i;
                }

                temp = temp.next;
                i++;

            }
            return -1;
        }

        public int helper(Node head,int key){
            if(head==null){
                return -1;

            }
            if(head.data==key){
                return 0;
            }
            int indx=helper(head.next,key);
            if(indx==-1){
                return -1;
            }
            return indx+1;
        }


        public int recSerch(int key){
            return helper( head,key);
        }
        public void Revers(){
            Node prev=null;
            Node curr=tail=head;
            Node next;
            while (curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }

        public Node findmid(Node head){
            Node slow=head;
            Node fast=head;
            while (fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;


        }
        public boolean findpalindron(){
            if(head==null || head.next==null){
                return  true;
            }
            // find the mid
            Node MidNode=findmid(head);
            // reverse the right part
            Node prev=null;
            Node curr=MidNode;
            Node next;
            while (curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            Node right= prev;// right half head
            Node left=head;
            // setp 3 compre right and left
            while (right!=null){
                if(left.data!=right.data){
                    return false;
                }
                left=left.next;
                right=right.next;
            }
            return true;
        }
        public static boolean iscycle(){
            Node slow=head;
            Node fast=head;
            while (fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(fast==slow){
                    return true;
                }
            }
            return false;

        }
        public static void removecycle(){
            Node slow=head;
            Node fast=head;
            boolean cycle=false;
            while (fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(fast==slow){
                    cycle=true;
                    break;
                }
            }
            if(cycle==false){
                return;
            }
            // find metting piont
            slow=head;
            Node prev=null;
            while (fast!=slow){
                prev=fast;
                slow=slow.next;
                fast=fast.next;
            }
            // remove the cycle
            prev.next=null;

        }

        public static void revese(int left,int right){
            Node prev=null;
            Node curr=head;
            Node next;
            for(int i=1;i<left;i++ ){
                curr=curr.next;
            }
            for(int i=left;i<=right;i++){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;

            }
            head=prev;
        }
        private Node getmid(Node head){
            Node slow=head;
            Node fast=head.next;
            while (fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
        private Node merge(Node head1,Node head2){
            Node mergell=new Node(-1);
            Node temp=mergell;
            while (head1!=null && head2!=null){
                if(head1.data<=head2.data){
                    temp.next=head1;
                    head1=head1.next;
                    temp=temp.next;
                }
                else{
                    temp.next=head2;
                    head2=head2.next;
                    temp=temp.next;
                }

            }
            while (head1!=null){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            while (head2!=null){
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
            return mergell.next;
        }

        public Node mergesort(Node head){
            if(head==null || head.next==null){
                return head;
            }
            //find mid
            Node mid=getmid(head);
            //left right ms
            Node rightHead=mid.next;
            mid.next=null;
            Node newleft=mergesort(head);
            Node newRight=mergesort(rightHead);
            // merge
            return merge(newleft,newRight);


        }
        public void zigzag(){
            // find mid
            Node slow=head;
            Node fast=head.next;
            while (fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            Node mid=slow;
            Node curr=mid.next;
            mid.next=null;
            Node prev=null;
            Node next;
            while (curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            Node left=head;
            Node right=prev;
            Node leftL,rightR;
            while (left!=null && right!=null){
                leftL=left.next;
                left.next=right;
                rightR=right.next;
                right.next=leftL;
                left=leftL;
                right =rightR;
            }
        }


    public static void main(String[] args) {
//        Linklist ll=new Linklist();
//
//        ll.addFast(1);
//       ll.addFast(2);
//        ll.addFast(3);
//        ll.addFast(4);
//        ll.addFast(6);
        // add last in linked list
       // ll.addlast(2);
       // ll.addlast(1);
        //add middle
       // ll.addmiddle(2,9);
        // print linked list
       // ll.print();
        // calculate size of linked list
       // System.out.println(ll.size);
        // search element i linked list
       // System.out.println(ll.serch(9));
//        System.out.println(ll.recSerch(1));
//       ll.Revers();
//      ll.print();
//        System.out.println(ll.findpalindron());
//        head=new Node(1);
//       Node temp=new Node(2);
//       head.next=temp;
//        head.next.next=new Node(3);
//        head.next.next.next=temp;
//        System.out.println(iscycle());
//        removecycle();
//        System.out.println(iscycle());
//        ll.print();
//        revese(2,3);
//        ll.print();
        Linklist ll=new Linklist();
        ll.addFast(5);
        ll.addFast(4);
        ll.addFast(3);
        ll.addFast(2);
        ll.addFast(1);
        ll.addFast(0);
        ll.print();
//        ll.head=ll.mergesort(ll.head);
//        ll.print();
        ll.zigzag();
        ll.print();

    }


}
