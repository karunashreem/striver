class MyStack {
    private int[] arr;
    private int top;
    private static final int max=1000;
    MyStack(){
        arr= new int[max];
        top=-1;
            
        }
    public void push(int x) {
        // code here
       if(top>=max-1){
           return;
       }
       top++;
       arr[top]=x;
    }

    public int pop() {
        // code here
        if(top==-1){
            return -1;
        }
        return arr[top--];
    }
}
