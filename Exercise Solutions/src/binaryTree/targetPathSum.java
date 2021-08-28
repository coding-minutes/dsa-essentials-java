package binaryTree;

import java.util.ArrayList;

public class targetPathSum {


    static class Node {
        int val;
        Node left, right;

        Node(int a){
            val =a;
        }

    }

    static ArrayList<ArrayList<Integer>> vv = new ArrayList<>();
    static void help(Node root, int a, ArrayList<Integer> v, int b)
    {
        if(root == null) return;
        if(root.left == null && root.right == null) {

            if(a == b+root.val)
            {
                v.add(root.val);
                vv.add(new ArrayList<>(v));
                v.remove(v.size()-1);
            }
            return;
        }
        if(root.left != null)
        {
            v.add(root.val);
            help(root.left, a, v, b+root.val);
            v.remove(v.size()-1);
        }
        if(root.right != null)
        {
            v.add(root.val);
            help(root.right, a, v, b+root.val);
            v.remove(v.size()-1);
        }
    }

    static ArrayList<ArrayList<Integer>> pathSum(Node root, int targetSum) {
        vv.clear();
        ArrayList<Integer> v = new ArrayList<>();
        help(root, targetSum, v, 0);
        return vv;
    }

    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        n1.left = n2;
        n2.right = n3;
        n3.right = n5;
        n2.left = n4;
        n4.right = n6;

        System.out.print(pathSum(n1, 13));
    }


}
