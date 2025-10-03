class Solution {
    void selectionSort(int[] arr) {
        // code here
        for(int i=0; i<arr.length; i++){
            int minInd=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minInd]>arr[j]){
                    minInd=j;
                }
            }
            int temp=arr[minInd];
            arr[minInd]= arr[i];
            arr[i]=temp;
        }
        return;
    }
}