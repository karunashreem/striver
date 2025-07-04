/*
class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references

    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}
*/
class Pair{
    Node node;
    int line;
    public Pair(Node _node, int _line){
        node=_node;
        line=_line;
    }
}

class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        // Code here
        ArrayList<Integer> res= new ArrayList<>();
        TreeMap<Integer, Integer> map= new TreeMap<>();
        Queue<Pair> q= new LinkedList<Pair>();
        q.offer(new Pair(root, 0));
        while(!q.isEmpty()){
            Pair p= q.poll();
            Node n= p.node;
            int x= p.line;
            
            map.put(x, n.data);
            if(n.left!=null) q.offer(new Pair(n.left, x-1));
            if(n.right!=null) q.offer(new Pair(n.right, x+1));
        }
        for(int value: map.values()){
            res.add(value);
        }
        
        return res;
    }
}