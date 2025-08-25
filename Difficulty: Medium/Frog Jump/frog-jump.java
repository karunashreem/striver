// User function Template for Java
class Solution {
    int jump(int[] height, int i, int[] dp){
        if(i==0) return 0;
        if(dp[i]!=-1) return dp[i];
        int left= jump(height, i-1, dp)+ Math.abs(height[i]-height[i-1]);
        int right=Integer.MAX_VALUE;
        if(i>1) right= jump(height, i-2, dp)+ Math.abs(height[i]-height[i-2]);
        dp[i]= Math.min(left, right);
        return dp[i];
    }
    int minCost(int[] height) {
        // code here
        int[] dp= new int[height.length];//memoization
        Arrays.fill(dp, -1);
        int cost=jump(height, height.length-1, dp);
        return cost;
    }
}