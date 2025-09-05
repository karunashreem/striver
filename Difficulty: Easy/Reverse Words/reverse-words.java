class Solution {
    public String reverseWords(String s) {
        // Code here
        // String[] str= s.split("\\.");
        // StringBuilder sb= new StringBuilder();
        // for(int i=str.length-1; i>=0; i--){
        //     sb.append(str[i]+".");
        // }
        // // sb.append(str[0]);
        // String res= sb.toString();
        // if(res.endsWith(".")){
        //     res= res.substring(0, res.length()-1);
        // }
        // return res;
        
        String[] word = s.split("\\.");
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = word.length - 1; i >= 0; i--)  {
            if(!word[i].isEmpty()) {
                sb.append(word[i]).append(".");
                
            }
        }
       String result = sb.toString();
       
       if(result.endsWith(".")) {
           result = result.substring(0,result.length() -1);
       }
       
        return result;
    }
}
