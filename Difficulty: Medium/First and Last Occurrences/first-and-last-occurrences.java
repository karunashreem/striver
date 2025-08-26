// User function Template for Java
class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        
        ArrayList<Integer> res= new ArrayList<>();
        int first=-1, last=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x && first==-1){
                first=i;
                last=i;
            }else if(arr[i]==x){
                last=i;
            }
        }
        res.add(first);
        res.add(last);
        return res;
    }
}
