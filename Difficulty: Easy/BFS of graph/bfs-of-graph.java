class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n= adj.size();
        boolean[] vis= new boolean[n];
        Queue<Integer> queue= new LinkedList<>();
        ArrayList<Integer> res= new ArrayList<>();
        queue.offer(0);
        vis[0]=true;
        while(!queue.isEmpty()){
            int node= queue.poll();
            res.add(node);
            for(int neighbor: adj.get(node)){
                if(!vis[neighbor]){
                    vis[neighbor]=true;
                    queue.offer(neighbor);
                }
            }
        }
        return res;
    }
}