class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low>=high) return;
            int partInd= partition(arr, low, high);
            quickSort(arr, low, partInd-1);
            quickSort(arr, partInd+1, high);
        
        
    }

    private int partition(int[] arr, int low, int high) {
        
        // code here
        int pivot= arr[low];
        int i=low, j=high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1) i++;
            while(arr[j]>pivot && j>=low+1) j--;
            if(i<j){
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        int temp= arr[low];
            arr[low]= arr[j];
            arr[j]= temp;
            
        return j;
    }
}