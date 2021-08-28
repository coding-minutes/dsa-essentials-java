package binaryTree;

import java.util.ArrayList;

public class removeHalfNodes {

    static class Node {
        int key;
        Node left;
        Node right;
        public Node(int a){
            key = a;
        }
    }

    static void inorder(Node root, ArrayList<Integer> v)
    {
        if(root == null)
            return;
        inorder(root.left, v);
        v.add(root.key);
        inorder(root.right, v);
    }

    static Node help(Node root)
    {
        //add code here.
        if(root==null)
            return null;
        if(root.right != null)
            root.right = help(root.right);
        if(root.left != null)
            root.left = help(root.left);
        if( (root.left != null && root.right == null) || (root.left == null && root.right != null) )
        {
            if(root.left != null)
                root = root.left;
            else
                root = root.right;
            root = help(root);
        }
        return root;

    }

    static ArrayList<Integer> removeHalfNodes(Node root)
    {
        //add code here.
        root = help(root);
        ArrayList<Integer> v = new ArrayList<>();
        inorder(root, v);
        return v;
    }

    public static void main(String[] args){
        Node one = new Node(1);
        Node two = new Node(2);
         Node three = new Node(3);
         Node four = new Node(4);
        Node five = new Node(5);
         Node six = new Node(5);
        one.left = two;
        six.right = three;
        two.right = five;
        two.left = four;
        four.right = six;

        System.out.print(removeHalfNodes(one));
    }


}
