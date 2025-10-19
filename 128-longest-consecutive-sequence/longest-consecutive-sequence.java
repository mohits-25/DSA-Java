class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0)return 0;
        Set<Integer> st=new HashSet<>();
        for(int num:nums) st.add(num);
        int longest=1;
        for(int num:st){
            if(!st.contains(num-1)){
                int cnt=1;
                int x=num;
                while(st.contains(x+1)){
                    x++;
                    cnt++;
                }
                longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }
}