public class BinaryTreeUsingInOreder {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int indx=-1;
        public static Node Buildtree(int node[]){
            indx++;
            if(node[indx]==-1){
                return null;
            }
            Node newnode=new Node(node[indx]);
            newnode.left=Buildtree(node);
            newnode.right=Buildtree(node);
            return newnode;
        }
        public static void Inorder(Node root){
            if(root==null){
                return;
            }
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
    }

    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.Buildtree(node);
        tree.Inorder(root);



    }
}
