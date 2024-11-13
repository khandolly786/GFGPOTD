class ListNode:
    def __init__(self, data=0, next=None):
        self.data = data
        self.next = next

def intersetPoint(head1, head2):
    # Initialize two pointers for the two lists
    ptr1, ptr2 = head1, head2

    # Traverse until both pointers are the same (or both None)
    while ptr1 != ptr2:
        # If ptr1 reaches the end of list1, redirect to the start of list2
        ptr1 = ptr1.next if ptr1 else head2
        # If ptr2 reaches the end of list2, redirect to the start of list1
        ptr2 = ptr2.next if ptr2 else head1

    # Either they meet at the intersection point or both are None
    return ptr1.data if ptr1 else -1
