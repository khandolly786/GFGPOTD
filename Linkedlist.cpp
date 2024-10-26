class Solution {
  public:
    int count(struct Node* head, int key) {
        int count = 0; // Initialize count to zero
        Node* current = head; // Start from the head of the linked list

        while (current != nullptr) {
            if (current->data == key) {
                count++; // Increment count if current node's data matches key
            }
            current = current->next; // Move to the next node
        }
        
        return count; // Return the total count of key occurrences
    }
};
