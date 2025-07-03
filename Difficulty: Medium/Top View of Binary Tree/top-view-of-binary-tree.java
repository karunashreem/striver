/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Pair{
    Node node;
    int x;
    public Pair(Node _n, int _x){
        node=_n;
        x=_x;
    }
}

class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    
    static ArrayList<Integer> topView(Node root) {
        // code here
        Map<Integer, Integer> map= new TreeMap<>();
        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(root, 0));
        while(!q.isEmpty()){
            Pair tp= q.poll();
            Node n= tp.node;
            int x= tp.x;
            
            if(!map.containsKey(x)){
                map.put(x, n.data);
            }
            if(n.left!=null) q.add(new Pair(n.left, x-1));
            if(n.right!=null)  q.add(new Pair(n.right, x+1));
            
        }
        ArrayList<Integer> res= new ArrayList<>();
        for(int value: map.values()){
            res.add(value);
        }
        return res;
    }
}