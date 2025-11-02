/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node merge(Node tempa, Node tempb){
        Node dummyHead=new Node(-1);
        Node head= dummyHead;
        while(tempa!=null && tempb!=null){
            if(tempa.data<=tempb.data){
                head.bottom= tempa;
                head= head.bottom;
                tempa=tempa.bottom;
            }else{
                head.bottom= tempb;
                head= head.bottom;
                tempb=tempb.bottom;
            }
        }
        while(tempa!=null){
            head.bottom= tempa;
            head= head.bottom;
            tempa=tempa.bottom;
        }
        while(tempb!=null){
            head.bottom= tempb;
            head= head.bottom;
            tempb=tempb.bottom;
        }
        return dummyHead.bottom;
    }
    public Node flatten(Node head) {
        // code here
        if(head==null || head.next==null) return head;
        
        head.next=flatten(head.next);
        Node merged= merge(head, head.next);
        return merged;
    }
}