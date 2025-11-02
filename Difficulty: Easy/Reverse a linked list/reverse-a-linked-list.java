/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node prev=null;
        Node temp= head;
        while(temp.next!=null){
            Node next= temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        temp.next=prev;
        return temp;
    }
}