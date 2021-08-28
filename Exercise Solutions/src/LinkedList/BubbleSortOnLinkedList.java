package LinkedList;

public class BubbleSortOnLinkedList {

    class node
    {

        int data;
        node  next;
        node(int data)
        {
            this.data = data;
            this.next = null;
        }
    };


    int len(node  head)
    {
        node  temp = head ;
        int i = 0 ;
        while(temp!=null)
        {
            i++;
            temp=temp.next ;
        }

        return i ;
    }
    node  bubble_sort_LinkedList_itr(node  head)
    {
        int n = len(head)-1;

        while(n-- != 0)

        {
            node  prev =null;
            node cur = head;
            while(cur.next!=null)
            {
                if(cur.data >=cur.next.data)
                {

                    if(prev==null)
                    {
                        //first node
                        node  nxt = cur.next ;
                        cur.next = nxt.next ;
                        nxt.next = cur ;
                        prev=nxt ;
                        head = prev ;


                    }

                    else
                    {

                        node  nxt = cur.next ;
                        prev.next = nxt ;
                        cur.next = nxt.next ;
                        nxt.next = cur ;
                        prev = nxt ;


                    }

                }
                else
                {

                    prev = cur ;
                    cur=cur.next ;

                }



            }

        }



        return head ;

    }

}
