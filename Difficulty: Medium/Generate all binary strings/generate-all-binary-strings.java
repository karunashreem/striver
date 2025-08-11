// User function Template for Java

class Solution {
    private static void generate(int n, String s, List<String> res){
        if(n==0){
            res.add(s);
            return;
        }
        generate(n-1, s+"0", res);
        if(s.length()==0 || s.charAt(s.length()-1)=='0'){
            generate(n-1, s+"1", res);
        }
        
    }
    public static List<String> generateBinaryStrings(int n) {
        // code here
        List<String> res= new ArrayList<>();
        generate(n, "", res);
        return res;
    }
}
