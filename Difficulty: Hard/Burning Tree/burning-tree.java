/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}  */
class Solution {
    private static Node markParent(Node root,int target, HashMap<Node, Node> mp){
        Node startNode= null;
        Queue<Node> queue = new LinkedList<>();
        mp.put(root, null);
        queue.offer(root);
        while(!queue.isEmpty()){
            Node n= queue.poll();
            if(n.data==target){
                startNode= n;
            }
            if(n.left!=null){
                mp.put(n.left, n);
                queue.offer(n.left);
            }
            if(n.right!=null){
                mp.put(n.right, n);
                queue.offer(n.right);
            }
        }
        return startNode;
    
    }
    public static int minTime(Node root, int target) {
        // code here
        HashMap<Node, Node> parent= new HashMap<>();
        Node targetNode= markParent(root, target, parent);
        HashSet<Node> visited= new HashSet<>();
        Queue<Node> queue= new LinkedList<>();
        queue.offer(targetNode);
        visited.add(targetNode);
        
        int time=0;
        while(!queue.isEmpty()){
            boolean burntNode= false;
            int size=queue.size();
            for(int i=0; i<size; i++){
                Node n= queue.poll();
                if(n.left!=null && !visited.contains(n.left)){
                visited.add(n.left);
                queue.offer(n.left);
                burntNode= true;
                }
                if(n.right!=null && !visited.contains(n.right)){
                visited.add(n.right);
                queue.offer(n.right);
                burntNode= true;
                }
                if(parent.get(n)!=null && !visited.contains(parent.get(n))){
                visited.add(parent.get(n));
                queue.offer(parent.get(n));
                burntNode= true;
                }
        }
        if(burntNode){
           time++;
       }
    }
        return time;
        
    }
}