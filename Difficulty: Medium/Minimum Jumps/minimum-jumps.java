class Solution {
    public int minJumps(int[] arr) {
        // code here
        if(arr[0]==0){
            return -1;
        }
        int maxJump=-1;
        int jump=arr[0], ans=1, max=arr[0];
        for(int i=1; i<arr.length; i++){
            max--;
            jump--;
            max=Math.max(arr[i], max);
            if(jump==0 && i!=arr.length-1){
                if(max==0){
                    return -1;
                }
                jump=max;
                max=0;
                ans++;
            }
        }
        return ans;
    }
}