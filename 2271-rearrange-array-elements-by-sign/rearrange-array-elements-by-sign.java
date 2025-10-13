class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n/2];  
        int[] neg = new int[n/2]; 

        int posIndex = 0, negIndex = 0;

      
        for (int num : nums) {
            if (num > 0) {
                pos[posIndex++] = num;
            } else {
                neg[negIndex++] = num;
            }
        }

        for (int i = 0; i < n / 2; i++) {
            nums[2 * i] = pos[i];    
            nums[2 * i + 1] = neg[i];   
        }

        return nums;
    }
}
