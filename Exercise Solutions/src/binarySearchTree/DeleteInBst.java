package binarySearchTree;

public class DeleteInBst {
    class node{
        public int data;
        public node left;
        public node right;
        public node(int d){
            data=d;
            left=null;
            right=null;
        }
    }


    node deleteNode(node root, int k){
        // Base case
        if (root == null)
            return root;

        // Recursive calls for ancestors of
        // node to be deleted
        if (root.data > k) {
            root.left = deleteNode(root.left, k);
            return root;
        }
        else if (root.data < k) {
            root.right = deleteNode(root.right, k);
            return root;
        }

        // We reach here when root is the node
        // to be deleted.

        // If one of the children is empty
        if (root.left == null) {
            node temp = root.right;
            return temp;
        }
        else if (root.right == null) {
            node temp = root.left;
            return temp;
        }

        // If both children exist
        else {

            node succParent = root;

            // Find successor
            node succ = root.right;
            while (succ.left != null) {
                succParent = succ;
                succ = succ.left;
            }

            // Delete successor.  Since successor
            // is always left child of its parent
            // we can safely make successor's right
            // right child as left of its parent.
            // If there is no succ, then assign
            // succ->right to succParent->right
            if (succParent != root)
                succParent.left = succ.right;
            else
                succParent.right = succ.right;

            // Copy Successor Data to root
            root.data = succ.data;

            // Delete Successor and return root
            return root;
        }
    }

}
