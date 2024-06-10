public class BinarySearchTreeUsingFindKey {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean seaech(Node root ,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return seaech(root.left,key);
        }
        else {
            return seaech(root.right,key);
        }
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.right=new Node(6);
        root.left.left=new Node(3);
        root.left.left.left=new Node(1);
        root.left.left.right=new Node(4);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(14);
        if(seaech(root,14)){
            System.out.println("The element is found In the Binary search tree");
        }
        else {
            System.out.println("The element is not founded in the Binary search tree");
        }

    }
}
