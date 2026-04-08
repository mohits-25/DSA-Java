class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0,cnt2=0;
        int el1=0,el2=0;
        for(int num:nums){
            if(cnt1==0&&num!=el2){
                cnt1=1;
                el1=num;
            }
            else if(cnt2==0&&num !=el1){
                cnt2=1;
                el2=num;
            }
            else if(num==el1){
                cnt1++;
            }
            else if(num==el2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int num:nums){
            if(num==el1)cnt1++;
            else if(num==el2)cnt2++;
        }
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        int mini=(n/3)+1;
        if(cnt1>=mini)ans.add(el1);
        if(cnt2>=mini)ans.add(el2);
        return ans;
    }
}