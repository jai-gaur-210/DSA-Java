import java.util.Stack;

public class postfixExp {
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> s = new Stack<Integer>();
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i) == '+'){
                int x =s.pop();
                int y =s.pop();
                int z = x+y;
                s.push(z);
            }
            else if(S.charAt(i) == '-'){
                int x =s.pop();
                int y =s.pop();
                int z = x-y;
                s.push(z);
            }
            else if(S.charAt(i) == '*'){
                int x =s.pop();
                int y =s.pop();
                int z = x*y;
                s.push(z);
            }
            else if(S.charAt(i) == '/'){
                int x =s.pop();
                int y =s.pop();
                int z = x/y;
                s.push(z);
            }
            else{
                int x = Integer.parseInt(S.charAt(i) + "");
                s.push(x);
            }

        }
        return s.pop();
    }
}
