
class Solution {
    private static void insert(int x, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(x);
            return;
        }
        int temp=s.pop();
        insert(x, s);
        s.push(temp);
    }
    static void reverse(Stack<Integer> s) {
        // code here
        if(s.isEmpty()) return;
        int x= s.pop();
        reverse(s);
        insert(x, s);
    }
}