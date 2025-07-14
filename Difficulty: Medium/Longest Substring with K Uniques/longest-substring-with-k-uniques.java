class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int len=-1;
        int left=0, right=0;
        HashMap<Character, Integer> map= new HashMap<>();
        while(right<s.length()){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);
                while(map.size()>k){
                    map.put(s.charAt(left), map.get(s.charAt(left))-1);
                    if(map.get(s.charAt(left))==0){
                        map.remove(s.charAt(left));
                    }
                    left++;
                }
                if(map.size()==k){
                    len=Math.max(len, right-left+1); 
                }
            right++;
        }
        return len;
    }
}