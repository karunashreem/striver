// User function Template for Java
class Solution {
    static int[] replaceWithRank(int arr[], int N) {
        // code here
        int[] temp = arr.clone();
        Arrays.sort(temp);
        
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        
        for(int num: temp){
            if(!rankMap.containsKey(num))
                rankMap.put(num, rank++);
        }
        
        int[] result = new int[N];
        for(int i=0; i<N; i++){
            result[i] = rankMap.get(arr[i]);
        }
        
        return result;
    }
}

 
