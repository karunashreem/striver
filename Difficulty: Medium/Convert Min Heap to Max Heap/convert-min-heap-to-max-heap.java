// User function Template for Java

class Solution {
    static void convertMinToMaxHeap(int N, int arr[]) {
        // code here
        for(int i=(N-1)/2; i>=0; i--){
            heapify( i, arr, N);
        }
    }
    static void heapify(int idx, int[] arr, int n){
        int largest=idx;
        int left= idx*2 +1;
        int right=idx*2+2;
        if(left<n && arr[left]>arr[largest]){
            largest=left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest=right;
        }
        if(idx!=largest){
            swap(arr, idx, largest);
            heapify(largest, arr, n);
        }
    }
    static void swap(int[] arr, int idx, int largest){
        int temp= arr[idx];
        arr[idx]=arr[largest];
        arr[largest]= temp;
        return;
    }
    
}
