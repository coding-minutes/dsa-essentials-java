package Stack;


class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
        next = null;
    }

}

public class stackLL<T> {


        Node<T>  head = null;

        void push(T data){
            Node<T>  n = new Node<T>(data);
            n.next = head;
            head = n;
        }

        boolean empty(){
            return head==null;
        }

        T top(){
            return head.data;
        }

        void pop(){
            if(!empty()){
                Node<T> temp = head;
                head = head.next;
            }

        }


}
