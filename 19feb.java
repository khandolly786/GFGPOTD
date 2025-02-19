class Solution {
    // Function to merge K sorted linked lists.
    Node mergeKLists(List<Node> arr) {
        if (arr == null || arr.isEmpty()) return null;

        // Min-Heap to store nodes in ascending order
        PriorityQueue<Node> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.data, b.data));

        // Step 1: Push all head nodes into the Min-Heap
        for (Node head : arr) {
            if (head != null) minHeap.add(head);
        }

        // Dummy node to start the merged list
        Node dummy = new Node(-1);
        Node tail = dummy; // Tail pointer to build the list

        // Step 2: Process nodes from the Min-Heap
        while (!minHeap.isEmpty()) {
            Node smallest = minHeap.poll(); // Extract the smallest node
            tail.next = smallest; // Attach to the merged list
            tail = tail.next;

            if (smallest.next != null) {
                minHeap.add(smallest.next); // Push next node from the same list
            }
        }

        return dummy.next;
    }
}
