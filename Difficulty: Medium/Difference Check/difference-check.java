class Solution {
    private int totalTime(String s){
        String[] time= s.split(":");
        int hour= Integer.parseInt(time[0]);
        int min=Integer.parseInt(time[1]);
        int sec=Integer.parseInt(time[2]);
        return hour*60*60+min*60+sec;
    }
    public int minDifference(String[] arr) {
        // code here
        Arrays.sort(arr);
        int ans= Integer.MAX_VALUE;
        int total=86400;
        for(int i=1; i<arr.length; i++){
            ans=Math.min(ans, totalTime(arr[i])- totalTime(arr[i-1]));
        }
        return Math.min(ans, total-(totalTime(arr[arr.length-1])- totalTime(arr[0])));
    }
}
