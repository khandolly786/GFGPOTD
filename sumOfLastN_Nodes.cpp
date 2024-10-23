class Solution {
  public:
    int sumOfLastN_Nodes(struct Node* head, int n) {
        if (!head) return 0;
        
        Node* first = head;
        Node* second = head;

        for (int i = 0; i < n; ++i) {
            if (first) {
                first = first->next;
            }
        }

        while (first) {
            first = first->next;
            second = second->next;
        }

        int sum = 0;
        while (second) {
            sum += second->data;
            second = second->next;
        }

        return sum;
    }
};
