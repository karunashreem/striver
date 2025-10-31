// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp= n;
        int sum=0;
        while(temp>0){
            int dig=temp%10;
            sum+=Math.pow(dig, 3);
            temp=temp/10;
        }
        if(sum==n) return true;
        return false;
    }
}