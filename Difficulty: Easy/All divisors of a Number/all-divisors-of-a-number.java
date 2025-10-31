class Solution {
    public static void print_divisors(int n) {
        // code here
        List<Integer> list= new ArrayList<>();
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                list.add(i);
                if(n%(n/i)==0 && (n/i)> Math.sqrt(n)){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
