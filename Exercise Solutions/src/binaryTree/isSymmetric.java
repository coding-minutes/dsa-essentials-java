package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class isSymmetric {


    class Node {
        int key;
        Node left, right;
    };
    boolean isTreeSymmetric(Node root) {
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();
        if(root == null || (root.right==null && root.left==null))
            return true;
        if(root.right == null || root.left == null)
            return false;

        q1.add(root.left);
        q2.add(root.right);
        while(!q1.isEmpty() && !q2.isEmpty())
        {
            Node f1 = q1.poll();
            Node f2 = q2.poll();

            if(q1.isEmpty() && !q2.isEmpty())
                return false;
            if(!q1.isEmpty() && q2.isEmpty())
                return false;
            if(f1.left==null && f2.right!=null)
                return false;
            if(f1.left!=null && f2.right==null)
                return false;
            if(f1.key != f2.key)
                return false;

            if(f1.left != null) q1.add(f1.left);
            if(f1.right!= null) q1.add(f1.right);
            if(f2.right!= null) q2.add(f2.right);
            if(f2.left!= null) q2.add(f2.left);
        }

        return q1.isEmpty() && q2.isEmpty();
    }

}
