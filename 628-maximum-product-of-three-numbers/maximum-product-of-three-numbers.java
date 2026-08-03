class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int a=nums.length;
        int n=nums[0]*nums[1]*nums[2];
        int m=nums[0]*nums[1]*nums[a-1];
        int l=nums[a-1]*nums[a-2]*nums[a-3];
        int now=Math.max(n,m);
        int end=Math.max(now,l);
        return end;    
    }
}