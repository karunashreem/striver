// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count=1;
        int maxCount=1;
        int i=1;
        int j=0;
        
        while(i<arr.length && j<dep.length){
            if(arr[i]<=dep[j]){
                count++;
                i++;
                if(count>maxCount){
                    maxCount=count;
                }
            }else{
                count--;
                j++;
            }
        }
        return maxCount;
    }
}
