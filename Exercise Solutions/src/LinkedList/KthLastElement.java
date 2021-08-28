package LinkedList;

public class KthLastElement {



    class node{

        int data;
        node next;

        node(int data){
            this.data = data;
            next = null;
        }
    };

    int kthLastElement(node  head,int k){
        //Complete this function to return kth last element
        node  fast = head;
        node  slow = head;

        int cnt = 0;
        while(cnt < k){
            fast = fast.next;
            cnt++;
        }

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }

}
