class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int[] knows= new int[mat.length];
        int[] knownby= new int[mat.length];
        
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==1){
                    knows[i]++;
                    knownby[j]++;
                }
            }
        }
        int res=-1;
        for(int i=0; i<knows.length; i++){
            if(knows[i]==1 && knownby[i]==knows.length){
                res=i;
            }
        }
        return res;
    }
}