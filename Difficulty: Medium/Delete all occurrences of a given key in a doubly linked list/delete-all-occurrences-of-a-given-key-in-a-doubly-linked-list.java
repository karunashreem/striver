// User function Template for Java

/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        if(head==null) return null;
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            if(temp.data==x){
                Node next= temp.next;
                if(prev==null){
                    head=next;
                    if(next!=null) next.prev= null;
                }
                else{
                    prev.next=next;
                    if(next!=null) next.prev=prev;
                }
                temp=next;
            }else{
                
            prev= temp;
            temp=temp.next;
            }
        }
        return head;
    }
}