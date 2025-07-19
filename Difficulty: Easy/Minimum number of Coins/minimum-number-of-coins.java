// User function Template for Java

class Solution {
    static List<Integer> minPartition(int N) {
        // code here
        List<Integer> res= new ArrayList<>();
        int[] denom= {2000, 500, 200, 100, 50, 20, 10, 5,2, 1};
        for(int i=0; i<denom.length; i++){
            while(N>=denom[i]){
                N-=denom[i];
                res.add(denom[i]);
            }
        }
        return res;
    }
}