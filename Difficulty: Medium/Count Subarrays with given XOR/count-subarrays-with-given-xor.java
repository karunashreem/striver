class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> map= new HashMap<>();
        // map.put(0,1);
        int prefixXor=0;
        int count=0;
        for(int i=0; i<arr.length; i++){
            prefixXor^=arr[i];
            if(prefixXor==k){
                count++;
            }
            if(map.containsKey(k^prefixXor)){
                count+=map.get(k^prefixXor);
            }
            map.put(prefixXor, map.getOrDefault(prefixXor, 0)+1);
        }
        return count;
    }
}