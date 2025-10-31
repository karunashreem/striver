class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=-1;
        int secMax=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }
            if(arr[i]>secMax && arr[i]!=max){
                secMax=arr[i];
            }
        }
        return secMax;
    }
}