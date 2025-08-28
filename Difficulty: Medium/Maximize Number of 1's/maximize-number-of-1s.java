class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int i=0, j=0;
        int len=0;
        int zeroes=0;
        while(j<arr.length){
            if(arr[j]==0){
                zeroes++;
                
            }
            while(zeroes>k){
                if(arr[i]==0){
                    zeroes--;
                }
                i++;
            }
            len=Math.max(len, j-i+1);
            j++;
        }
        return len;
    }
}