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
    public int lengthOfLoop(Node head) {
        // code here
        Node slow= head;
        Node fast=head;
        int count=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                fast=fast.next;
                count=1;
                while(fast!=slow){
                    fast= fast.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }
}