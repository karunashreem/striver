// User function Template for Java

class Solution {
    private static String reverse(String s, StringBuilder sb, int i){
        if(i<0) return sb.toString();
        sb.append(s.charAt(i));
        return reverse(s, sb, i-1);
        
    }
    public static String reverseString(String s) {
        // code here
        StringBuilder sb= new StringBuilder();
        String str= reverse(s, sb, s.length()-1);
        return str;
    }
}