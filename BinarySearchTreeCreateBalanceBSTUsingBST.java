import java.util.ArrayList;

public class BinarySearchTreeCreateBalanceBSTUsingBST {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void CreateInorder(Node root,ArrayList<Integer>inorder){
        if(root==null){
            return;
        }
        CreateInorder(root.left,inorder);
        inorder.add(root.data);
        CreateInorder(root.right,inorder);
    }
    public static Node CreateBST(ArrayList<Integer>inorder,int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(inorder.get(mid));
        root.left=CreateBST(inorder,st,mid-1);
        root.right=CreateBST(inorder,mid+1,end);
        return root;
    }
    public static Node BalanceBST(Node root){
        // Calculate Sorted array
        ArrayList<Integer>inorder=new ArrayList<>();
        CreateInorder(root,inorder);
        //Create Balance BST
        root=CreateBST(inorder,0,inorder.size()-1);
        return root;
    }
    public static void printBST(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        printBST(root.left);
        printBST(root.right);
    }

    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);
        root=BalanceBST(root);
        printBST(root);

    }
}
