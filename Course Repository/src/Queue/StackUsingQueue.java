package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {


    static class Stack{
        Queue<Integer> q1 = new LinkedList<>(), q2 = new LinkedList<>();

        void push(int x){
            //will insert in the non-empty queue
            if(!q1.isEmpty()){
                q1.add(x);
            }
            else{
                q2.add(x);
            }
        }

        void pop(){
            if(q1.isEmpty()){
                //shift the elements from q2 to q1
                while(!q2.isEmpty()){
                    int front = q2.poll();

                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(front);
                }
            }
            else{
                //shift the elements from q1 to q2
                while(!q1.isEmpty()){
                    int front = q1.poll();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(front);
                }
            }

        }

        int top(){
            if(q1.isEmpty()){
                //shift the elements from q2 to q1
                while(!q2.isEmpty()){
                    int front = q2.poll();

                    q1.add(front);
                    if(q2.isEmpty()){
                        return front;
                    }
                }
            }
            else{
                while(true){
                    int front = q1.poll();
                    q2.add(front);
                    if(q1.isEmpty()){
                        //top element of the stack
                        return front;
                    }
                }
            }
            return 0;

        }
        boolean empty(){
            return q1.isEmpty() && q2.isEmpty();
        }
    };


    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.pop();
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.pop();


        while(!s.empty()){
            System.out.println(s.top());
            s.pop();
        }


    }







}
