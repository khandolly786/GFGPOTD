class Solution {
    class pair{
        int a;
        int b;
        double val;
        public pair(int a, int b){
            this.a = a;
            this.b = b;
            this.val = Math.sqrt((a*a)+(b*b));
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        // Your code here
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->Double.compare(a.val, b.val));
        for(int [] a : points){
            pq.add(new pair(a[0], a[1]));
        }
        int [][] res = new int [k][2];
        for(int i=0;i<k;i++){
            res[i][0] = pq.peek().a;
            res[i][1] = pq.peek().b;
            pq.poll();
        }
        return res;
        
    }
}
