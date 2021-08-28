package Stack;

import java.util.Stack;

public class insertBottom {


    //Challenge: Insert at Stack Bottom
    static void insertAtBottom(Stack<Integer> s, int data){

        if(s.empty()){
            s.push(data);
            return;
        }
        //rec case
        int temp = s.peek();
        s.pop();

        insertAtBottom(s,data);
        s.push(temp);
    }

    //Challenge : Reverse the Stack
    static void reverse(Stack<Integer> s){

        if(s.empty()){
            return;
        }

        int t = s.peek();
        s.pop();
        reverse(s);
        insertAtBottom(s,t);
    }


    public static void main(String[] args) {


        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        insertAtBottom(s,5);
//        reverse(s);

        while(!s.empty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
