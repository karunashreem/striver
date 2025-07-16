// User function Template for Java

class Solution {
    
    public boolean countSub(long arr[], long n) {
        // Your code goes here
       for(int i=0; i<arr.length; i++){
           int left= 2*i+1;
           int right=2*i+2;
           if(left<n && arr[left]>arr[i] || right<n && arr[right]>arr[i]){
               return false;
           }
       }
       return true;
    }
    
}