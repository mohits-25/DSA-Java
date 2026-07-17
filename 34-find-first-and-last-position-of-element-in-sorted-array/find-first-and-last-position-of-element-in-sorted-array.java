class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int a[]=new int[2];
        a[0]=first(nums,n,target);
        a[1]=last(nums,n,target);
        return a;
    }
    public int first(int arr[],int n,int k){
        int low=0;
        int high=n-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<k) low=mid+1;
            else high=mid-1;
        }
        return first;
    }
    public int last(int arr[],int n,int k){
        int low=0;
        int high=n-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<k) low=mid+1;
            else high=mid-1;
        }
        return last;
    }
}