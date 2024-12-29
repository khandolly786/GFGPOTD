class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        
        HashSet<Integer> hs = new HashSet<>();
        
        int i=0;
        int j=0;
        int n=a.length;
        int m=b.length;
        while(i<n && j<m) {
            if(a[i] == b[j]) {
                hs.add(a[i]);
                i++;
                j++;
            } else if(a[i] < b[j]){
                i++;
            } else {
                j++;
            }
        }
        
        return new ArrayList<>(hs);
    }
}
