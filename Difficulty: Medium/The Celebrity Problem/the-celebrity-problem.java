class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n=mat.length;
        int[] knowme= new int[n];
        Arrays.fill(knowme, 0);
        int[] iknow=new int[n]; 
        Arrays.fill(iknow, 0);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]==1){
                    knowme[j]++;
                    iknow[i]++;
                }
            }
        }
        for(int i=0; i<n; i++){
            if(knowme[i]==n && iknow[i]==1){
                return i;
            }
        }
        return -1;
    }
}