class Solution {
    // Function to merge K sorted linked list.
    public Node merge(Node l1, Node l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.data <= l2.data) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }

    // Function to merge K sorted linked lists.
    Node mergeKLists(List<Node> arr) {
        if (arr == null || arr.isEmpty()) {
            return null;
        }
        
        // Initialize the result linked list.
        Node res = null;

        // Merge each linked list into the result.
        for (Node list : arr) {
            res = merge(res, list);
        }

        return res;
    }
}
