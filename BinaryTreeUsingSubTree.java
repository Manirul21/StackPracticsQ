public class BinaryTreeUsingSubTree {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean IsIdentical(Node root,Node Subtre){
        if(root==null && Subtre==null){
            return true;
        } else if(root == null||Subtre == null||root.data!=Subtre.data){
            return false;
        }
        if(!IsIdentical(root.left,Subtre.left)){
            return false;
        }
        if(!IsIdentical(root.right,Subtre.right)){
            return false;
        }
        return true;


    }
    public static boolean IsSubtree(Node root,Node Subtre){
        if(root==null){
            return false;
        }
        if(root.data==Subtre.data){
            if(IsIdentical(root,Subtre)){
                return true;
            }
        }
        return IsSubtree(root.left,Subtre)||IsSubtree(root.right,Subtre);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(7);
        root.right.right=new Node(6);

        Node Subtre=new Node(2);
        Subtre.left=new Node(4);
        Subtre.right=new Node(5);
        System.out.println(IsSubtree(root,Subtre));
    }
}
