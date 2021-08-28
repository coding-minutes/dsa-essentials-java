package binarySearchTree;

public class isBst {

    class Node
    {

        public int key;
        public Node left;
        public Node right;

        public Node(int key){
            this.key = key;
            left = right  = null;
        }
    }

    boolean isBSTUtil(Node node, int min, int max)
    {
        /* an empty tree is BST */
        if (node==null)
            return true;

    /* false if this node violates
    the min/max constraint */
        if (node.key < min || node.key > max)
            return false;

    /* otherwise check the subtrees recursively,
    tightening the min or max constraint */
        return isBSTUtil(node.left, min, node.key) && isBSTUtil(node.right, node.key, max);
    }

    boolean isBST(Node  root){
        //complete this method
        return isBSTUtil(root, Integer.MIN_VALUE,Integer.MAX_VALUE);

    }
}
