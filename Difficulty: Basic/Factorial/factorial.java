class Solution {
    // Function to calculate factorial of a number.
    int fact(int n, int mul){
        if(n==1){
            return mul;
        }
        mul*=n;
        return fact(n-1, mul);
    }
    int factorial(int n) {
        // code here
        int mul=1;
        return fact(n, mul);
        
    }
}
