import java.util.*;

public class reverseFirstKelementsOfQueue {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Stack< Integer> s = new Stack<>();
        for(int i=0; i<k; i++){
            s.push(q.poll());
        }

        for(int i=0; i<k; i++){
            q.add(s.pop());
        }

        int x = q.size() - k;

        for(int i =0; i<x; i++){
            q.add(q.poll());
        }
        return q;
    }
}
