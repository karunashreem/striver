class Solution {
    public int romanToDecimal(String s) {
        // code here
        HashMap<Character, Integer> mp= new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
        int ans=0;
       for(int i=0; i<s.length()-1; i++){
           int num1=mp.get(s.charAt(i));
           int num2=mp.get(s.charAt(i+1));
           
           if(num1>=num2){
               ans+= num1;
           }else{
               ans-=num1;
           }
       }
       ans+=mp.get(s.charAt(s.length()-1));
       return ans;
    }
}