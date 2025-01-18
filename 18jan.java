class Solution {
    Node reverseList(Node head) {
        Node prev = null;   // Previous node starts as null
        Node current = head; // Start with the head node

        while (current != null) {
            Node nextNode = current.next; // Save the next node
            current.next = prev;         // Reverse the link
            prev = current;              // Move prev to current node
            current = nextNode;          // Move to the next node
        }

        return prev; // New head of the reversed linked list
    }
}
