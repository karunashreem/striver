class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){
            int part= partition(arr, low, high);
            quickSort(arr, low, part-1);
            quickSort(arr, part+1, high);
        }
        return;
        
    }

    private int partition(int[] arr, int low, int high) {
        int pivot= arr[high];
        int i= low-1;
        
        for(int j= low; j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
            }
        }
        int temp= arr[i+1];
        arr[i+1]=arr[high];
        arr[high]= temp;
        return i+1;
    }
}