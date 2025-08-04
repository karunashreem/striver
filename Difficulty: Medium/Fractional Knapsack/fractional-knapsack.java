class Solution {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        // code here
        int n= values.length;
        List<item> list= new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(new item(weights[i], values[i], (double) values[i]/weights[i]));
        }
        Collections.sort(list, (a, b) -> Double.compare(b.ratio, a.ratio));
        
        int i=0;
        double total=0.0;
        while(i<list.size() &&  W>0){
            item i1= list.get(i);
            if(i1.weight<=W){
                total+=i1.value;
                W-=i1.weight;
            }else{
                total+= (i1.ratio)*W;
                W=0;
                break;
            }
            i++;
        }
        return total;
    }
}
class item{
    int weight;
    int value;
    double ratio;
    item(int w, int v, double r){
        weight=w;
        value= v;
        ratio=r;
    }
}