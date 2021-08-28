package BST;

public class bstBasics {


    static class Node
    {

        int key;
        Node  left;
        Node  right;

        Node(int key){
            this.key = key;
            left = right  = null;
        }
    }

    static Node  insert(Node   root, int key){
        if(root==null){
            return new Node(key);
        }

        //rec case
        if(key < root.key){
            root.left = insert(root.left,key);
        }
        else{
            root.right = insert(root.right,key);
        }
        return root;

    }
    //O(H)
    static boolean search(Node   root, int key){
        if(root==null){
            return false;
        }
        if(root.key==key){
            return true;
        }
        if(key < root.key){
            return search(root.left,key);
        }
        return search(root.right,key);
    }


    static void printInOrder(Node  root){
        if(root==null){
            return;
        }
        //left, root, right
        printInOrder(root.left);
        System.out.print(root.key + " ,");
        printInOrder(root.right);
    }

    static Node  findMin(Node root){

        while(root.left!=null){
            root = root.left;
        }
        return root;

    }

//BST Deletion
static Node  remove(Node  root,int key){
        if(root==null){
            return null;
        }
        else if(key < root.key){
            root.left = remove(root.left,key);
        }
        else if(key > root.key){
            root.right = remove(root.right,key);
        }
        else{
            //when the current node matches with the key
            // No children
            if(root.left==null && root.right==null){
                root = null;
            }
            // Single Child
			else if(root.left==null){
                Node  temp = root;
                root = root.right;
            }
            else if(root.right==null){
                Node temp = root;
                root = root.left;
            }
            //2 Children
            else{
                Node  temp = findMin(root.right);
                root.key = temp.key;
                root.right = remove(root.right,temp.key);
            }

        }
        return root;

    }
    //Challenge : Print all elements of BST which lie in the range k1 && k2
    static void printRange(Node  root, int k1,int k2){
        if(root==null){
            return;
        }

        if(root.key>=k1 && root.key<=k2){
            //call on both sides
            printRange(root.left,k1,k2);
            System.out.print(root.key + " ");
            printRange(root.right,k1,k2);
        }
			else if(root.key > k2){
            printRange(root.left,k1,k2);
        }
        else{
            // root.key < k1
            printRange(root.right,k1,k2);
        }
    }


    public static void main(String[] args) {

        Node   root = null;
        int[] arr = {8,3,10,1,6,14,4,7,13};

        for(int x : arr){
            root = insert(root,x);
        }
        printInOrder(root);
        System.out.println();

        int key;
        //cin>>key;
        //root = remove(root,key);
        //cout<<search(root,key) <<endl;
        //printInOrder(root);
        System.out.println("Range is:");
        printRange(root,5,12);



    }

}
