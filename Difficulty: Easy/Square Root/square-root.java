class Solution {
    int floorSqrt(int n) {
        // code here
        int res= 1;
        int i=1, j=n;
        while(i<=j){
            int mid= (i+j)/2;
            if(mid*mid==n){
               return mid;
            }else if(mid*mid<n){
                res=mid;
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return res;
    }
}