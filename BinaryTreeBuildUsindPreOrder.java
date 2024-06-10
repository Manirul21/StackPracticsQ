public class BinaryTreeBuildUsindPreOrder {
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
        public static Node Buildtree(int nodes[]){
            indx++;
            if(nodes[indx]==-1){
                return null;
            }
            Node newnode=new Node(nodes[indx]);
            newnode.left=Buildtree(nodes);
            newnode.right=Buildtree(nodes);
            return newnode;
        }
        // PreOrder Traversal on tree
        public static void preOrder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void Inorder(Node root){
            if(root==null){
                return;
            }
            Inorder(root.left);
            System.out.print( root.data+" ");
            Inorder(root.right);
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.Buildtree(nodes);
       tree.Inorder(root);

    }
}
