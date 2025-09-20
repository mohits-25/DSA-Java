class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int nz = 0;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp[nz++] = nums[i];
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (i < nz) {
                nums[i] = temp[i];
            } else {
                nums[i] = 0;
            }
        }
    }
}