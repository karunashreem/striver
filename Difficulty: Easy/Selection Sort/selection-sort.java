class Solution {
    void selectionSort(int[] arr) {
        // code here
        for(int i=0; i<arr.length; i++){
            int min=arr[i];
            int minInd=i;
            for(int j=i; j<arr.length; j++){
                if(arr[j]<min){
                     min=arr[j];
                     minInd=j;
                }
            }
            int temp=arr[i];
            arr[i]=min;
            arr[minInd]= temp;
            
        }
        return;
    }
}