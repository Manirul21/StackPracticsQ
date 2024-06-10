public class BinaryTreeCalculateHeight {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftdam=diameter(root.left);
        int lefth=height(root.left);
        int rightdam=diameter(root.right);
        int righth=height(root.right);
        int selfh=lefth+righth+1;
        return Math.max(selfh,Math.max(leftdam,rightdam));
    }
    // diameter 2rd approch
    static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;

        }
    }
    public static Info diametrs(Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info leftdiam=diametrs(root.left);
        Info rightdiam=diametrs(root.right);
        int diam=Math.max(Math.max(leftdiam.diam,rightdiam.diam),leftdiam.ht+rightdiam.ht+1);
        int ht=Math.max(rightdiam.ht,leftdiam.ht)+1;
        return new Info(diam,ht);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(diametrs(root).diam);

    }
}
