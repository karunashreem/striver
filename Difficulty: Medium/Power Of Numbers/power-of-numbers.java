class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int pow=0;
        int temp=n;
        while(temp>0){
            pow=pow*10+temp%10;
            temp/=10;
        }
        return (int)Math.pow(n, pow);
    }
}
