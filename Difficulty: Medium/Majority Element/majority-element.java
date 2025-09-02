class Solution {
    int majorityElement(int arr[]) {
        // code here
        int major=arr[0];
        int count=1;
        for(int i=1; i<arr.length; i++){
            if(count==0){
                major=arr[i];
            }
            if(arr[i]==major){
                count++;
            }else{
                count--;
            }
            
        }
        count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==major){
                count++;
            }
        }
        if(count>arr.length/2){
            return major;
        }
        return -1;
    }
}