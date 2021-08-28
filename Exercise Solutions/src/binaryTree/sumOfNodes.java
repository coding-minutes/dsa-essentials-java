package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class sumOfNodes {

    class Node {
        int key;
        Node left, right;
    }

    int sumBT(Node root)
    {
        // Code here
        int res = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node f = q.poll();
            if(f.left != null) q.add(f.left);
            if(f.right != null) q.add(f.right);
            res += f.key;
        }
        return res;
    }

}
