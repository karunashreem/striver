/* class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Tree {
    int findCeil(Node root, int key) {
        // code here
        Node temp= root;
        int ceil=-1;
        while(temp!=null){
            if(temp.data==key){
                return key;
            }else if(temp.data>key){
                ceil=temp.data;
                temp=temp.left;
            }else{
                temp=temp.right;
            }
        }
        return ceil;
        
    }
}