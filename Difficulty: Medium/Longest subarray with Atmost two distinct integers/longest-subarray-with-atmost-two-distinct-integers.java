class Solution {
    public int totalElements(int[] arr) {
        // code here
        
        int len=0;
        HashMap<Integer, Integer> map= new HashMap<>();
        int left=0;
        for(int right=0; right<arr.length; right++){
            map.put(arr[right], map.getOrDefault(arr[right], 0)+1);
            while(map.size()>2){
                map.put(arr[left], map.get(arr[left])-1);
                if(map.get(arr[left])==0){
                    map.remove(arr[left]);
                }
                left++;
            }
            len= Math.max(len, right-left+1);
        }
        return len;
    }
}