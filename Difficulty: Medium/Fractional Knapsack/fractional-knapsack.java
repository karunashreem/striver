class Solution {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        // Create array of items with value and weight
        Item[] items = new Item[values.length];
        for (int i = 0; i < values.length; i++) {
            items[i] = new Item(values[i], weights[i]);
        }
        
        // Sort items by value/weight ratio in descending order
        Arrays.sort(items, new Comparator<Item>() {
            public int compare(Item a, Item b) {
                double ratioA = (double)a.value / a.weight;
                double ratioB = (double)b.value / b.weight;
                return Double.compare(ratioB, ratioA); // descending order
            }
        });
        
        double maxValue = 0.0;
        int remainingCapacity = W;
        
        for (Item item : items) {
            if (remainingCapacity <= 0) break;
            
            if (item.weight <= remainingCapacity) {
                // Take whole item
                maxValue += item.value;
                remainingCapacity -= item.weight;
            } else {
                // Take fraction of item
                double fraction = (double)remainingCapacity / item.weight;
                maxValue += item.value * fraction;
                remainingCapacity = 0;
            }
        }
        
        return maxValue;
    }
    
    class Item {
        int value;
        int weight;
        
        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }
}