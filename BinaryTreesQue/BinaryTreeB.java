package BinaryTreesQue;
import java.util.*;
public class BinaryTreeB{
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    //Binary tree Build
    static class binTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1) return null;
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
         
    }
     //Pre Order Traversal
        public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    //Inorder Traversal
    public static void InOrder(Node root){
        if(root==null) return;
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }
    //Post Order Traversal
    public static void PostOrder(Node root){
        if(root==null) return;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");
    }
    //Level Order Traversal
    public static void levelOrder(Node root){
        if(root==null) return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
            if(q.isEmpty()) break;
            else q.add(null);
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null)
                q.add(currNode.left);
                if(currNode.right!=null) 
                q.add(currNode.right);
            }
        }
    }
    //Height of a tree  
    public static int height(Node root){
        if(root==null) return 0;
        int leftHe=height(root.left);
        int rightHe=height(root.right);
        return Math.max(leftHe, rightHe)+1;
    }
    
    public static void main(String []args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binTree tree=new binTree();
        Node root=tree.buildTree(nodes);
        levelOrder(root);
        int Height=height(root);
        System.out.println("Height of a tree is : "+ Height);
    }


    
}
