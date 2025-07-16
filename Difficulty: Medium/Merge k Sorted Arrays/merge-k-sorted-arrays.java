class Solution {
    // Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr, int k) {
        // Write your code here.
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0; i<k; i++){
            for(int j=0; j<k; j++){
                pq.add(arr[i][j]);
            }
        }
        ArrayList<Integer> res= new ArrayList<>();
        while(!pq.isEmpty()){
            res.add(pq.poll());
        }
        return res;
    }
}