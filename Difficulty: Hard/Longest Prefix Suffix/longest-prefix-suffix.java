class Solution {
    int getLPSLength(String s) {
        // code here
        int n=s.length();
        int cnt=0;
        int pref=0, suff=1, pos=1;
        while(pref<n && suff<n){
            if(s.charAt(pref)==s.charAt(suff)){
                cnt++;
                pref++;
                suff++;
            }else{
                cnt=0;
                pos++;
                suff=pos;
                pref=0;
            }
        }
        return cnt;
    }
}