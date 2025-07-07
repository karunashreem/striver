class Solution {
    boolean isSafe(int node, boolean[][] graph, int[] color, int currcolor, int V){
        for(int i=0; i<V; i++){
            if(graph[node][i]==true && color[i]==currcolor){
                return false;
            }
        }
        return true;
    }
    boolean solve(int node, boolean[][] graph, int[] color, int m, int V){
        if(node==V) return true;
        for(int i=1; i<=m; i++){
            if(isSafe(node, graph, color, i, V)){
                color[node]=i;
                if(solve(node+1, graph, color, m, V)){
                    return true;
                }
                color[node]=0;
            }
        }
        return false;
    }
    boolean graphColoring(int V, int[][] edges, int m) {
        // code here
        boolean[][] graph= new boolean[V][V];
        for(int[] edge: edges){
            int u= edge[0];
            int v= edge[1];
            
            graph[u][v]= true;
            graph[v][u]= true;
        }
        int[] color= new int[V];
        return solve(0, graph, color, m, V);
        
    }
} 