public class BinaryTreeCalculateMinDistanceBetweenNode {
    static class Node{
        int data;
     Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node lca2(Node root ,int n1,int n2){
        if(root==null|| root.data==n1||root.data==n2){
            return root;
        }
        Node leftlca=lca2(root.left,n1,n2);
        Node rightlca=lca2(root.right,n1,n2);
        if(rightlca==null){
            return leftlca;
        }
        if(leftlca==null){
            return  rightlca;
        }
        return root;
    }
    public static int lcaDist(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDist=lcaDist(root.left,n);
        int rightDist=lcaDist(root.right,n);
        if(leftDist==-1&& rightDist==1){
            return -1;
        }else if(rightDist==-1){
            return leftDist+1;
        }
        else {
            return rightDist+1;
        }
    }
    public static int minDist(Node root,int n1,int n2){
        Node lac1=lca2(root,n1,n2);
        int dist1=lcaDist(lac1,n1);
        int dist2=lcaDist(lac1,n2);
        return dist2+dist1;

    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        root.right.left=new Node(7);
        int n=4,n1=6;
        System.out.println(minDist(root,n,n1));
    }


}
