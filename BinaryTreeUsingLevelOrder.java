import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeUsingLevelOrder {
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
            Node newNode=new Node(nodes[indx]);
            newNode.left=Buildtree(nodes);
            newNode.right=Buildtree(nodes);
            return newNode;


        }
        public static void levelorder(Node root){
            if(root==null){
                return;
            }
            Queue<Node>q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()){
                Node curr=q.remove();
                if(curr==null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                }else {
                    System.out.print(curr.data+" ");
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.Buildtree(nodes);
        tree.levelorder(root);

    }
}
