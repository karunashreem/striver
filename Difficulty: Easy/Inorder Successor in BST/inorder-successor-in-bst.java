/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Solution {
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    public int inorderSuccessor(Node root, Node x) {
        // add code here.
        Node temp= root;
        int succ=-1;
        while(temp!=null){
            if(temp.data<=x.data){
                temp= temp.right;
            }else{
                if(succ==-1){
                    succ= temp.data;
                }else if(succ!=-1 && succ>temp.data && temp.data>x.data){
                    succ=temp.data;
                }
                temp= temp.left;
            }
        }
        return succ;
    }
}