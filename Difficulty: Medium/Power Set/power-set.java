// User function Template for Java

class Solution {
    public void powerSet(char[] ch, int i, StringBuilder sb, List<String> res){
        if(i==ch.length){
            if(sb.length()!=0)  res.add(sb.toString());
            return;
        }
        sb.append(ch[i]);
        powerSet(ch, i+1, sb, res);
        sb.deleteCharAt(sb.length()-1);
        powerSet(ch, i+1, sb, res);
        return;
    }
    public List<String> AllPossibleStrings(String s) {
        // Code here
        List<String> res= new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        char[] ch= s.toCharArray();
        powerSet(ch, 0, sb, res);
        Collections.sort(res);
        return res;
    }
}