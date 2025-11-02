/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    public int getCount(Node head) {
        // code here
        if(head==null) return 0;
        int len=1;
        Node temp=head;
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        return len;
    }
}