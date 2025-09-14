// User function Template for Java

class Solution {
    String dupli(String s, int i, String ns, HashSet<Character> set){
        if(i==s.length()) return ns;
        char c= s.charAt(i);
        if(!set.contains(c)){
            ns+=c;
            set.add(c);
            return dupli(s, i+1, ns, set);
        }
        
        return dupli(s, i+1, ns, set);
    }
    String removeDuplicates(String s) {
        HashSet<Character> set= new HashSet<>();
        return dupli(s, 0, "", set);
    }
}
