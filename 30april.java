class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // code here.
        Node slow=head;
        Node fast=head;
        int count=1;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=slow.next;
                while(slow!=fast){
                    slow=slow.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }
}
