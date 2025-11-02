class Solution {
    void merge(int[] arr, int l, int m, int r){
        int left=l, mid=m, right=m+1;
        ArrayList<Integer> list= new ArrayList<>();
        while(left<=mid && right<=r){
            if(arr[left]<=arr[right]){
                list.add(arr[left++]);
            }else{
                list.add(arr[right++]);
            }
        }
        while(left<=mid){
            list.add(arr[left++]);
        }
        while(right<=r){
            list.add(arr[right++]);
        }
        
        for(int i=0; i<list.size(); i++){
            arr[i+l]= list.get(i);
        }
    }
    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l<r){
            int mid= l+(r-l)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
        return;
    }
}