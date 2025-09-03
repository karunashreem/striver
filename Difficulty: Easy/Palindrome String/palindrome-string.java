class Solution {
    boolean isPalindrome(String s) {
        // code here
        int start=0, last= s.length()-1;
        while(start<last){
            if(s.charAt(start)!=s.charAt(last)){
                return false;
            }
            start++;
            last--;
        }
        return true;
    }
}