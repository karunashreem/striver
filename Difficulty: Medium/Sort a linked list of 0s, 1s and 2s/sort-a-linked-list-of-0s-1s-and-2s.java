/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        Node dummy= new Node(0);
        int countz=0, counto=0, countt=0;
        
        Node temp=head;
        while(temp!=null){
            if(temp.data==0) countz++;
            if(temp.data==1) counto++;
            if(temp.data==2) countt++;
            
            temp=temp.next;
        }
        Node h= dummy;
        while(countz!=0){
            h.next= new Node(0);
            h=h.next;
            countz--;
        }
        while(counto!=0){
            h.next= new Node(1);
            h=h.next;
            counto--;
        }
        while(countt!=0){
            h.next= new Node(2);
            h=h.next;
            countt--;
        }
        return dummy.next;
    }
}