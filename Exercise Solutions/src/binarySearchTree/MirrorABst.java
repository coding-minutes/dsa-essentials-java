package binarySearchTree;

public class MirrorABst {

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

    void mirror(Node node)
    {
        if (node == null)
            return;
        else
        {
            Node temp;

            /* do the subtrees */
            mirror(node.left);
            mirror(node.right);

            /* swap the pointers in this node */
            temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
    }

    Node mirrorBST(Node  root){
        mirror(root);
        return root;
    }
}
