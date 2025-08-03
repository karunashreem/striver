// User function Template for Java

class Solution {
    static long count(int n) {
        // code here
        int totaledge= (n*(n-1))/2;
        return (long) Math.pow(2, totaledge);
        
    }
}
