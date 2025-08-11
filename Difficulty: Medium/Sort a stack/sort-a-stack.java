/*Complete the function below*/
class GfG {
    private Stack<Integer> insert(int x, Stack<Integer> s){
        if(s.isEmpty() || x>s.peek()){
            s.push(x);
            return s;
        }
        int temp= s.pop();
        insert(x, s);
        s.push(temp);
        return s;
    }
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        if(s.isEmpty()) return s;
        int x= s.pop();
        sort(s);
        insert(x, s);
        return s;
    }
}