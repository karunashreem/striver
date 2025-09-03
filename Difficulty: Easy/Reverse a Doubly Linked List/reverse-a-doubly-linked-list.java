/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        Node node= head;
        while(node!=null){
            Node temp= node.next;
            node.next= node.prev;
            node.prev= temp;
            if(node.prev==null){
                head=node;
            }
            node=node.prev;
        }
        return head;
    }
}