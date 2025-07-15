// User function Template for Java

class Solution {
    static String minWindow(String s1, String s2) {
        // code here
       int left=0, right=0, k=0;
       int len=Integer.MAX_VALUE;
       String str="";
       
       while(right<s1.length()){
           if(s1.charAt(right)==s2.charAt(k)) k++;
           if(k==s2.length()){
               left= right;
               k=s2.length()-1;

           while(left>=0 && k>=0 ){
               if(s1.charAt(left)==s2.charAt(k))  k--;
               left--;
           }
           left++;
           if(len>right-left+1){
               len=right-left+1;
               str=s1.substring(left, right+1);
           }
           k=0;
           right=left+1;
           }else{
               right++;
           }
       }
       return str;
        
    }
}
