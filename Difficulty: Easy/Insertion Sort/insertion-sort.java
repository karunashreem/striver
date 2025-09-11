class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<i; j++){
                if(arr[j]> arr[i]){
                    int temp=arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }else{
                    continue;
                }
            }
        }
        return;
    }
}