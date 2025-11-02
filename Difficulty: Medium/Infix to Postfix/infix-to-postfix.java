class Solution {
    private static int priority(char c){
        if(c=='+'|| c=='-') return 1;
        if(c=='*' || c=='/') return 2;
        if(c=='^') return 3;
        
        return -1;
    }
    public static String infixToPostfix(String s) {
        // code here
        Stack<Character> st= new Stack<>();
        StringBuilder sb= new StringBuilder();
        int i=0;
        while(i<s.length()){
            char c= s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                sb.append(s.charAt(i));
            }else if(c=='('){
                st.push(c);
            }else if(c==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    sb.append(st.peek());
                    st.pop();
                }
                st.pop();
            }else{
                while(!st.isEmpty() && st.peek() != '('){
                    
                    // Handling Exponentiation (Right-Associative)
                    if(st.peek() == '^' && c == '^'){
                        // If stack top is '^' and incoming is '^', 
                        // DO NOT pop. Push the incoming '^' (RIGHT associativity).
                        break; 
                    }
                    
                    // General Left-Associative rule (pop if incoming is <= stack top)
                    // This handles all other operators (and includes the case for 'c' < st.peek() for '^' too)
                    if(priority(c) <= priority(st.peek())){
                        sb.append(st.pop());
                    } else {
                        break; // Stop popping if incoming priority is higher
                    }
                }
                st.push(c);
            }
            i++;
        }
        
        while(!st.isEmpty()){
            // Note: This assumes balanced parentheses. 
            // If any '(' remains, it would indicate an invalid expression.
            sb.append(st.pop());
        }
        return sb.toString();
    }
}
