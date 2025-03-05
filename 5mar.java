class Solution {
    public int func(HashSet<String> set, String src){
        Queue<String> q = new LinkedList<>();
        q.add(src);
        int res = 0;
        while(q.isEmpty() == false){
            
            res++;
            int len = q.size();
            for(int i = 0; i < len; i++){
                String str = q.poll();
                for (int j = 0; j < str.length(); j++) {
                    String s = str.substring(0, j) + str.substring(j + 1); // Fix StringBuilder issue
                    if (set.contains(s)) {
                        q.add(s);
                    }
                }
                
            }
        }
        return res;
    }
    public int longestStringChain(String words[]) {
        // code here
        int res = 1;
        HashSet<String> set = new HashSet<>();
        for(int i = 0;i < words.length; i++) set.add(words[i]);
        for(int i = 0; i < words.length; i++){
            res = Math.max(res, func(set, words[i]));
        }
        return res;
    }
}
