class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: arr){
            pq.add(i);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        while(k-->0){
            result.add(pq.remove());
        }
        
        return result;
    }
}
