class Solution {

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        List<Job> l1= new ArrayList<Job>();
        int max= 0;
        for(int i=0; i<deadline.length; i++){
            l1.add(new Job(i, deadline[i], profit[i]));
            if(deadline[i]>max){
                max= deadline[i];
            }
        }
        Collections.sort(l1, (a, b) -> Integer.compare(b.profit, a.profit));
        int[] dayjob= new int[max+1];
        Arrays.fill(dayjob, -1);
        int count=0, prof=0;
        
        for(Job j: l1){
            for(int t= j.deadline; t>0; t--){
                if(dayjob[t]==-1){
                    dayjob[t]=j.id;
                    count++;
                    prof+=j.profit;
                    break;
                }
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
res.add(count);
res.add(prof);
        return res;
    }
}
class Job{
    int id;
    int deadline;
    int profit;
    Job(int idx, int dd, int pro){
        id= idx;
        deadline=dd;
        profit= pro;
    }
}