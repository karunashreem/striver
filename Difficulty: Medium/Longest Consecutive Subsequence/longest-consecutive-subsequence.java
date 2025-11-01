class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        if(arr==null){
            return 0;
        }
        int maxi=1;
        int count=0;
        int temp=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]-1==temp){
                count++;
                temp=arr[i];
            }else if(arr[i]!=temp){
                count=1;
                temp=arr[i];
            }
            maxi=Math.max(maxi, count);
        }
        return maxi;
    }
}