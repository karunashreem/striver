class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        List<Meeting> meet= new ArrayList<Meeting>();
        int n=start.length;
        for(int i=0; i<n; i++){
            meet.add(new Meeting(start[i], end[i], i));
        }
        Collections.sort(meet, (a, b) -> Integer.compare(a.end, b.end));
        int cnt=1;
        int s=meet.get(0).end;
        for(int i=1; i<meet.size(); i++){
            Meeting m= meet.get(i);
            if(s<m.start){
                cnt++;
                s=m.end;
            }
        }
        return cnt;
    }
}
class Meeting{
    int start;
    int end;
    int meetNum;
    Meeting(int s, int e, int no){
        start= s;
        end=e;
        meetNum=no;
    }
}