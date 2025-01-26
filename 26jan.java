class Solution {
  public:
    // Function to remove a loop in the linked list.
    void removeLoop(Node* head) {
        // code here
        Node *p = head, *q = head, *p_t;
        bool loop = false;
        while(q){
            p_t = p;
            p = p->next;
            q = q->next;
            if(q){
                q = q->next;
                
                if(p == q){
                    loop = true;
                    break;
                }
            }
        }
        
        if(loop == false){
            return;
        }
        
        q = head;
        
        while(p != q){
            p_t = p;
            p = p->next;
            q = q->next;
        }
        
        p_t->next = NULL;
    }
};