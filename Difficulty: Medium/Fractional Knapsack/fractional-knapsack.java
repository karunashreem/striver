

class Solution {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        List<Item> sortedVal = new ArrayList<>();
        
        for (int i = 0; i < values.length; i++) {
            double rat = (double) values[i] / weights[i]; // Fix: Use double division
            sortedVal.add(new Item(values[i], weights[i], rat)); // Fix: Create Item object
        }
        
        Collections.sort(sortedVal, (a, b) -> Double.compare(b.rat, a.rat)); // Fix: Collections.sort
        
        double max = 0.00;
        int remWeight = W;
        
        for (Item item : sortedVal) {
            if (remWeight == 0) 
                return max;
            
            if (item.weight <= remWeight) {
                max += item.value;
                remWeight -= item.weight;
            } else {
                max += ((double) item.value / item.weight) * remWeight; // Fix: Correct fractional calculation
                remWeight = 0;
            }
        }
        
        return max; // Ensure method always returns
    }
}

class Item {
    int value;
    int weight;
    double rat;
    
    Item(int val, int wei, double ratio) {
        this.value = val;
        this.weight = wei;
        this.rat = ratio; // Fix: Correct typo (ration → ratio)
    }
}