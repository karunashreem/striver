/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node reverse(Node head){
        Node prev=null;
        while(head!=null){
            Node next= head.next;
            head.next= prev;
            prev= head;
            head= next;
        }
        return prev;
    }
    public Node addOne(Node head) {
        // code here.
        Node temp=reverse(head);
        Node temp1=temp;
        int carry=1;
        Node lastNode=null;
        while(temp!=null && carry==1){
            int sum= temp.data+1;
            temp.data=sum%10;
            carry=sum/10;
            if(temp.next==null && carry==1){
                temp.next=new Node(1);
                carry=0;
            }
            temp=temp.next;
        }
        head= reverse(temp1); 
        return head;
    }
}