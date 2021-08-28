package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InterleaveTwoHalvesOfQueue {


    Queue<Integer> interLeave(Queue<Integer> q){
        int n=q.size();
        Queue<Integer> q1 = new LinkedList<>(), q2 = new LinkedList<>();
        for (int i=0;i<(n/2);i++) {
            q1.add(q.peek());
            q.poll(); //Expected Time Complexity: O(2^n)


        }
        for (int i=0;i<(n/2);i++) {
            q2.add(q.peek());
            q.poll();
        }

        for (int i=0;i<(n/2);i++) {
            q.add(q1.peek());
            q1.poll();
            q.add(q2.peek());
            q2.poll();
        }
        return q;
    }
}
