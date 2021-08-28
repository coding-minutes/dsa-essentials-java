package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KthLevel {

    static class Node {
        public int key;
        public Node left, right;
        public Node(int k){
            key = k;
        }
    }

    static ArrayList<Integer> printKthLevel(Node root, int k){
        // your code goes here
        // Create Queue
        Queue<Node> que = new LinkedList<>();

        // Enqueue the root node
        que.add(root);

        // Create a set
        ArrayList<Integer> s = new ArrayList<>();

        // Level to track
        // the current level
        int level = 0;
        int flag = 0;

        // Iterate the queue till its not empty
        while (!que.isEmpty()) {

            // Calculate the number of nodes
            // in the current level
            int size = que.size();

            // Process each node of the current
            // level and enqueue their left
            // and right child to the queue
            while (size > 0) {
                size--;
                Node ptr = que.poll();


                // If the current level matches the
                // required level then add into set
                if (level == k) {

                    // Flag initialized to 1
                    flag = 1;

                    // Inserting node data in set
                    s.add(ptr.key);
                }
                else {

                    // Traverse to the left child
                    if (ptr.left != null)
                        que.add(ptr.left);

                    // Traverse to the right child
                    if (ptr.right != null)
                        que.add(ptr.right);
                }
            }

            // Increment the variable level
            // by 1 for each level
            level++;

            // Break out from the loop
            // if the Kth Level is reached
            if (flag == 1)
                break;
        }
        return s;
    }

    public static void main(String[] args){
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        one.left = two;
        one.right = three;
        two.right = five;
        two.left = four;

        System.out.print(printKthLevel(one, 2));
    }

}
