class Solution {
    ArrayList<Integer> findTwoElement(int a[]) {
        // code here
        long n= a.length;
        long sum= (n*(n+1))/2;
        long sum2n= (n*(n+1)*(n*2+1))/6;
        long s=0, s2= 0;
        for(int i=0; i<a.length; i++){
            s+=a[i];
            s2+=((long)a[i]* (long)a[i]);
        }
        long val1= s-sum;
        long val2= s2- sum2n;
        val2= val2/val1;// x+y
        long x= (val2+val1)/2;//2x/2
        long y= x-val1;
        ArrayList<Integer> l1= new ArrayList<>();
        l1.add((int) x);
        l1.add((int) y);
        return l1;
        
    }
}
