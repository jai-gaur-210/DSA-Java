import java.util.Stack;

public class MinOfStack {
    public int min(Stack<Integer> s)
        {
           //add code here.
           int x = Integer.MAX_VALUE;
           while(!s.isEmpty()){
            x = Math.min(s.pop() , x);
           }

        return x;
	}
}
