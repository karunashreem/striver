// User function Template for Java

class Solution {
    static int pageFaults(int N, int C, int pages[]) {
        // code here
        int faults=0;
        HashSet<Integer> set= new LinkedHashSet<>();//to maintain the insertion order
        for(int i=0; i<pages.length; i++){
            if(!set.contains(pages[i])){
                if(set.size()==C){
                    Iterator<Integer> it= set.iterator();
                    it.next();//goes to first/least recently used element
                    it.remove();//removes it
                }
                set.add(pages[i]);
                faults++;
            }
            else{
                set.remove(pages[i]);
                set.add(pages[i]);//to add it to the last as it was frequently used.
            }
        }
        return faults;
    }
}