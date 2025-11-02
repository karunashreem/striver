/*
  class Node {
   int data;
    Node next;

    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
        if(head==null) return false;
        Node temp=head;
        
        while(temp.next!=null && temp.data!=key ){
            temp=temp.next;
        }
        if(temp.data==key) return true;
        return false;
    }
}