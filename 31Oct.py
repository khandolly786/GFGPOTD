class Node:
    def __init__(self, data):
        self.data = data
        self.prev = None
        self.next = None

class Solution:
    # Function to insert a node in a sorted doubly linked list.
    def sortedInsert(self, head, x):
        # Creating the new node with the given value x.
        new_node = Node(x)

        # Case 1: If the list is empty, return the new node as the head.
        if not head:
            return new_node

        # Case 2: If the new node needs to be inserted before the head.
        if x <= head.data:
            new_node.next = head
            head.prev = new_node
            return new_node  # New node becomes the new head.

        # Case 3: Insert the new node in the middle or end of the list.
        current = head
        while current.next and current.next.data < x:
            current = current.next

        # Insert the new node after the current node.
        new_node.next = current.next
        new_node.prev = current
        current.next = new_node

        if new_node.next:
            new_node.next.prev = new_node

        return head
