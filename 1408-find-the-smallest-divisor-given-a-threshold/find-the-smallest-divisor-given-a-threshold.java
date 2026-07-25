class Solution {
    int sumbyd(int[] nums, int div) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] + div - 1) / div;
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;
        
        for (int num : nums) {
            if (num > high) high = num;
        }
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (sumbyd(nums, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return low;
    }
}