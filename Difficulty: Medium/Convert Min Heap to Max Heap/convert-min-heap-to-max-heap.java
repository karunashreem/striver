// User function Template for Java

class Solution {
    static void convertMinToMaxHeap(int N, int arr[]) {
        // code here
        for(int i=(N-1)/2; i>=0; i--){
            heapify(arr, i, N);
        }
    }
    static void heapify(int[] arr, int idx, int n){
        int largest=idx;
        int left= idx*2+1;
        int right=idx*2+2;
        if(left<n && arr[left]>arr[largest]){
            largest=left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=idx){
            swap(arr, largest, idx);
            heapify(arr, largest, n);
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
}
