class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        Arrays.sort(arr);
        int count=1;
        int max=1;
        for(int i=1;i<arr.length;i++)
        {
            int n=i-1;
            if(arr[i]==arr[n]+1)
            {
                count++;
            }
            else
            {
                if(arr[i]!=arr[n])
                {
                    count=1;
                }
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
