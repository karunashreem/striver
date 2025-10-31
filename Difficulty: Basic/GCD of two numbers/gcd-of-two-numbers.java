class Solution {
    public static int gcd(int a, int b) {
        // code here
        if(b>a){
            return gcd(b, a);
        }
        while(a>0){
            int temp=b;
            b=a;
            a= temp%a;
        }
        return b;
    }
}
