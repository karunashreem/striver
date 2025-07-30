// User function Template for Java

class Solution {
    public static int floor(Node root, int x) {
        // Code here
        Node temp= root;
        int floor= -1;
        while(temp!=null){
            if(temp.data==x){
                return x;
            }else if(temp.data<x){
                floor= temp.data;
                temp= temp.right;
            }else{
                temp= temp.left;
            }
        }
        return floor;
    }
}