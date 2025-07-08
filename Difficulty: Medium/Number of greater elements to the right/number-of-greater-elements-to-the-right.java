// User function Template for Java

class Solution {
    public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
        // code here
        int[] res= new int[queries];
        for(int idx=0; idx<queries; idx++){
            int count=0;
            for(int i=N-1; i>indices[idx]; i--){
                if(arr[i]> arr[indices[idx]]){
                    count++;
                }
            }
            res[idx]=count;
        }
        return res;
    }
}

