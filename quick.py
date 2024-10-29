class Node:
    def __init__(self, data=0, next=None):
        self.data = data
        self.next = next

def getTail(node):
    while node and node.next:
        node = node.next
    return node

def partition(head, end):
    pivot = end
    prev = None
    curr = head
    newHead = None
    newEnd = pivot

    while curr != pivot:
        nextNode = curr.next
        if curr.data < pivot.data:
            if newHead is None:
                newHead = curr
            prev = curr
        else:
            if prev:
                prev.next = curr.next
            curr.next = None
            newEnd.next = curr
            newEnd = curr
        curr = nextNode

    if newHead is None:
        newHead = pivot

    if prev:
        prev.next = None

    return pivot, newHead, newEnd

def quickSortRec(head, end):
    if not head or head == end:
        return head

    pivot, newHead, newEnd = partition(head, end)

    # If newHead is not pivot, we need to sort the left part
    if newHead != pivot:
        # Find the last node of the left part
        temp = newHead
        while temp.next != pivot and temp.next is not None:
            temp = temp.next
        temp.next = None  # Disconnect the left part

        newHead = quickSortRec(newHead, temp)  # Sort the left part

        # Find the new tail of the left part
        temp = getTail(newHead)
        temp.next = pivot  # Connect pivot to the end of the left part

    pivot.next = quickSortRec(pivot.next, newEnd)  # Sort the right part

    return newHead

def quickSort(head):
    if not head:
        return head
    end = getTail(head)
    return quickSortRec(head, end)

# Helper functions to create and print a linked list
def createLinkedList(arr):
    head = Node(arr[0])
    current = head
    for value in arr[1:]:
        current.next = Node(value)
        current = current.next
    return head

def printLinkedList(head):
    current = head
    while current:
        print(current.data, end=' -> ')
        current = current.next
    print('None')

# Example usage
arr = [1, 6, 2]
head = createLinkedList(arr)
print("Original Linked List:")
printLinkedList(head)

sorted_head = quickSort(head)
print("Sorted Linked List:")
printLinkedList(sorted_head)
