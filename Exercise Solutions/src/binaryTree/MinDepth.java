package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepth {

    static class Node {
        int key;
        Node left, right;
        public Node(int a){
            key = a;
        }
    }


    static class Pair{
        Node first;
        int second;

        Pair(Node n, int a){
            first = n;
            second = a;
        }
    }

    static int minDepth(Node root) {
        // Your code here
        int res = Integer.MAX_VALUE;
        Queue<Pair> q = new LinkedList<>();
        int d = 1;
        q.add(new Pair(root, d));
        while(!q.isEmpty())
        {
            Node f = q.peek().first;
            d = 1+q.peek().second;
            if(f.left == null && f.right == null)
                res = Math.min(res, q.peek().second);
            q.poll();
            if(f.left != null) q.add(new Pair(f.left, d));
            if(f.right != null) q.add(new Pair(f.right, d));
        }
        return res;
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

        System.out.print(minDepth(one));
    }


}
