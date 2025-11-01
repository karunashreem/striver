class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer, Integer> map= new HashMap<>();
        int len=0;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(sum==0){
                len=Math.max(len, i+1);
            }else{
                if(map.get(sum)!=null){
                    len=Math.max(len, i-map.get(sum));
                }else{
                    map.put(sum, i);
                }
            }
            
        }
        return len;
    }
}