class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int value=mpp.getOrDefault(nums[i],0);
            mpp.put(nums[i],value+1);
        }
        for(Map.Entry<Integer,Integer> it: mpp.entrySet()){
            if(it.getValue()>(nums.length/2)){
                return it.getKey();
            }
        }
    return -1;
}
}