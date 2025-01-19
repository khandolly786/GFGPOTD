
class Solution {
    public Node rotate(Node head, int k) {
        // add code here
        if (head == null || head.next == null) {
            return head;
        }
        Node connecting = head;
        Node moving = connecting;
        int length = 1;
        while (connecting.next != null) {
            connecting = connecting.next;
            length++;
        }
        k = k % length;
        while (k-- > 0) {
            connecting.next = head;
            connecting = connecting.next;
            head = head.next;
            connecting.next = null;
        }
        return head;
    }
}
