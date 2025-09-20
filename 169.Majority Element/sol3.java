class Solution {
    public int majorityElement(int[] nums) {
        // Phase 1: Find the candidate
        int cnt = 0;
        int el = -1;
        for (int i = 0; i < nums.length; i++) {
            if (cnt == 0) {
                el = nums[i];
                cnt = 1;
            } else if (nums[i] == el) {
                cnt++;
            } else {
                cnt--;
            }
        }
        
        // Phase 2: Verify the candidate
        int cnt1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el) {
                cnt1++;
            }
        }
        
        if (cnt1 > nums.length / 2) {
            return el;
        }
        
        return -1; // This should never be hit if there's always a majority element
    }
}