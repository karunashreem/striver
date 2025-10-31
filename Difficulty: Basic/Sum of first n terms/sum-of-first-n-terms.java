// User function Template for Java

class Solution {
    int sum(int n, int s){
        if(n==0) return s;
        s+=Math.pow(n, 3);
        return sum(n-1, s);
    }
    int sumOfSeries(int n) {
        // code here
        if(n==0) return 0;
        return sum(n, 0);
    }
}