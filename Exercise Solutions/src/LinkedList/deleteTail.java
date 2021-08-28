package LinkedList;

public class deleteTail {



    class node{
        int data;
        node  next;

        node(int data){
            this.data = data;
            next = null;
        }
    };

    node  deleteTail(node   head){
        //Complete this function
        if (head == null)
            return null;

        if (head.next == null) {
            return null;
        }

        // Find the second last node
        node  second_last = head;
        while (second_last.next.next != null)
            second_last = second_last.next;


        // Change next of second last
        second_last.next = null;

        return head;
    }

}
