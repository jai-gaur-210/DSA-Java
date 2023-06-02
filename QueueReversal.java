import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer> s = new Stack<Integer>();
        while(!q.isEmpty()){
            s.push(q.poll());
        }
        Queue<Integer> ans = new LinkedList<Integer>();

        while(!s.isEmpty()){
            ans.add(s.pop());
        }
        return ans;
    }
}
