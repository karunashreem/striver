// User function Template for Java

class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int time=0, wt=0;
        for(int i=0; i<bt.length; i++){
            wt+=time;
            time+=bt[i];
        }
        return (int) wt/bt.length;
    }
}
