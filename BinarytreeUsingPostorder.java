public class BinarytreeUsingPostorder {
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
    static class Binarytree{
        static int indx=-1;
        public static Node Buildtree(int nodes[]){
            indx++;
            if(nodes[indx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[indx]);
            newNode.left=Buildtree(nodes);
            newNode.right=Buildtree(nodes);
            return newNode;
        }
        public static void Postorder(Node root){
            if(root==null){
                return;
            }
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree=new Binarytree();
        Node root=tree.Buildtree(nodes);
        tree.Postorder(root);


    }
}
