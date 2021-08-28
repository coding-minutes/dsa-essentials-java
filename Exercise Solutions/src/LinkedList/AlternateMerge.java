package LinkedList;

public class AlternateMerge {


    static class node{

        int data;
        node next;

        node(int data){
            this.data = data;
            next = null;
        }
    };

    node append(node root, int d){
        if(root == null)
            return new node(d);
        node temp = root;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new node(d);
        return root;
    }

    node alternateMerge(node  root1, node root2){
        //Complete this function
        node root = null;
        if(root1 == null) return root2;
        if(root2== null) return root1;
        while(root1 != null && root2 != null){
            root = append(root, root1.data);
            root = append(root, root2.data);
            root1 = root1.next;
            root2 = root2.next;
        }
        if(root1 != null){
            while(root1 != null){
                root = append(root, root1.data);
                root1 = root1.next;
            }
        }
        if(root2 != null){
            while(root2 != null){
                root = append(root, root2.data);
                root2 = root2.next;
            }
        }
        if(root1== null) return root2;
        if(root2== null) return root1;
        return root;
    }

}
