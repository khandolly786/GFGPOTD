class Solution {
public:
    bool isLengthEven(struct Node *head) {
        int count = 0;
        Node *current = head;

        // Traverse the list and count the nodes
        while (current != NULL) {
            current = current->next;
            count++;
        }

        // Check if the count is even
        return count % 2 == 0;
    }
};
