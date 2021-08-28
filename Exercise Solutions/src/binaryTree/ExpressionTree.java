package binaryTree;

public class ExpressionTree {


    class Node {
        String key;
        Node left, right;
    }

    boolean isOp(String data)
    {
        if(data.equals("+") || data.equals("-") || data.equals("*") || data.equals("/"))
            return true;
        return false;
    }

    int evalTree(Node root){
        if(root == null)
            return 0;
        if(!isOp(root.key))
            return Integer.parseInt(root.key);

        if(root.key.equals("+"))
            return evalTree(root.left)+evalTree(root.right);
        if(root.key.equals("-"))
            return evalTree(root.left)-evalTree(root.right);
        if(root.key.equals("*"))
            return evalTree(root.left)*evalTree(root.right);
        if(root.key.equals("/"))
            return evalTree(root.left)/evalTree(root.right);
        return 0;
    }
}
