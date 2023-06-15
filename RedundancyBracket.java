import java.util.Stack;
public class RedundancyBracket {
    int checkRedundancy(String s) {
        Stack<Character> st = new Stack<>(); 
        
        for(int i=0; i<s.length(); i++){
            
            if(s.charAt(i) == ')'){
                Boolean flag =false;
                while(st.peek() != '('){
                    if(st.peek() != '+' || st.peek() == '-' || st.peek() == '*' || st.peek() == '/'){
                        flag = true;
                    }
                    st.pop();
                }
                st.pop();   
                if(flag == false){
                    return 1;
                }
            }
            else{
                st.push(s.charAt(i));
            }
            
        }
        return 0;
    }
}
// ((a+b) + (a+b))