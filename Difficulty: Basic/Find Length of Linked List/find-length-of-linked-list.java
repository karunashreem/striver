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
        Node temp= head;
        int len=1;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        return len;
    }
}