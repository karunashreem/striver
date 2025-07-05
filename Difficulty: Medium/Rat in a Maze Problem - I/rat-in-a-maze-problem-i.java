class Solution {
    // Function to find all possible paths
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> res= new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        solve(0, 0, maze, sb, res);
        return res;
    }
    private static void solve(int row, int col, int[][] maze, StringBuilder s, ArrayList<String> res){
        if(row==col && row==maze.length-1){
            res.add(new String(s.toString()));
            return;
        }
        if (row < 0 || col < 0 || row >= maze.length || col >= maze[0].length || maze[row][col] != 1) {
            return; // Out of bounds or not a valid cell
        }
        // Mark the cell as visited
        maze[row][col] = -1;
        
        if(row+1<maze.length && maze[row+1][col]==1 ){
            s.append('D');
            solve(row+1, col, maze, s, res);
            s.deleteCharAt(s.length()-1);
        }
        if(col-1>=0 && maze[row][col-1]==1 ){
            s.append('L');
            solve(row, col-1, maze,s, res);
            s.deleteCharAt(s.length()-1);
        }
        if(col+1<maze.length && maze[row][col+1]==1){
            s.append('R');
            solve(row, col+1, maze, s, res);
            s.deleteCharAt(s.length()-1);
        }
        if( row-1>=0 && maze[row-1][col]==1){
            s.append('U');
            solve(row-1, col, maze, s, res);
            s.deleteCharAt(s.length()-1);
        }
        maze[row][col] = 1;
    }
}