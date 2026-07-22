class Solution {
    public boolean possible(int[] bloomDay,int day,int m,int k){
        int cnt=0;
        int nb=0;
        for(int bloom:bloomDay){
            if(bloom<=day){
                cnt++;
            }else{
                nb+=cnt/k;
                cnt=0;
            }
        }
        nb+=cnt/k;
        return nb>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long flowersNeeded=1L*m*k;
        if(flowersNeeded>bloomDay.length){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int bloom:bloomDay){
            min=Math.min(min,bloom);
            max=Math.max(max,bloom);
        }
        int low=min;
        int high=max;
        while(low<=high){
            int mid=(low)+(high-low)/2;
            if(possible(bloomDay,mid,m,k)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}