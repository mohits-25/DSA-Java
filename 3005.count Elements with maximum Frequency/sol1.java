class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freqmap = new HashMap<>();

        
        for (int num : nums) {
            freqmap.put(num, freqmap.getOrDefault(num, 0) + 1);
        }

        
        int maxfreq = 0;
        for (int freq : freqmap.values()) {
            maxfreq = Math.max(maxfreq, freq);
        }

       
        int total = 0;
        for (int freq : freqmap.values()) {
            if (freq == maxfreq) {
                total += freq;
            }
        }

        return total;
    }
}