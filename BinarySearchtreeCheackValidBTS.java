public class BinarySearchtreeCheackValidBTS {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean isvalid(Node root){
        return isValidBTS(root,null,null);
    }
    public static boolean isValidBTS(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        else if(max!=null&& root.data>=max.data){
            return false;
        }
        return isValidBTS(root.left,min,root)&&isValidBTS(root.right,root,max);
    }
    public static void main(String[] args) {
        Node root= new Node(5);
        root.left=new Node(3);
        root.left.left=new Node(1);
        root.left.right=new Node(4);
        root.right=new Node(6);
        root.right.right=new Node(7);
        if (isvalid(root)){
            System.out.println("Valid BST");
        }
        else {
            System.out.println("Not Valid BST");
        }

    }
}
