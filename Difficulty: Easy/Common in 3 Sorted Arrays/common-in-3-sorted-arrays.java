// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        List<Integer> list= new ArrayList<>();
        int i=0, j=0, k=0;
        while(i<arr1.size() && j<arr2.size() && k<arr3.size()){
            if(arr1.get(i).equals(arr2.get(j)) && arr2.get(j).equals(arr3.get(k))){
                if(list.isEmpty() || !list.get(list.size()-1).equals(arr1.get(i))){
                    list.add(arr1.get(i));
                }
                i++;
                j++;
                k++;
            }else if(arr1.get(i)<arr2.get(j)){
                i++;
            }else if(arr2.get(j)<arr3.get(k)){
                j++;
            }else{
                k++;
            }
        }
        if(list.isEmpty()) list.add(-1);
        return list;
    }
}