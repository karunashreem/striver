/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        ArrayList<Integer> temp= new ArrayList<>();
        solve(root, temp, res);
        return res;
    }
    private static void solve(Node root,ArrayList<Integer>temp, ArrayList<ArrayList<Integer>> res){
        if (root==null) return;
        
        temp.add(root.data);
        if(root.left==null && root.right==null){
            res.add(new ArrayList<>(temp));;
        }else{
        solve(root.left, temp, res);
        solve(root.right, temp, res);
        }
        temp.remove(temp.size()-1);
    }
}