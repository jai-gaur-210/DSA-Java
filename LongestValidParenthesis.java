import java.util.Stack;

class LongestValidParenthesis{
    static int maxLength(String S){
        // code here
        int n = S.length();
        Stack<Character> s = new Stack<>();
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i) == '('){
                s.push(S.charAt(i));
            }
            else{
                if(!s.isEmpty()){
                    if(s.peek() == '('){
                        s.pop();
                    }
                    else{
                        s.push(S.charAt(i));
                    }
                }
                else{
                    s.push(S.charAt(i));
                }
                
            }
        }
        int ans = n-s.size();
        return ans;
    }
}