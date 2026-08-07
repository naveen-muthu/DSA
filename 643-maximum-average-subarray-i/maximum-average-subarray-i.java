class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double csum=0;
        for(int i=0;i < k;i++){
            csum=csum+nums[i];
        }
        double sum=csum/k;
        for(int i=k;i<nums.length;i++){
            csum=csum-nums[i-k]+nums[i];
            double avg=csum/k;
            sum=Math.max(sum,avg);
        }
        return sum;

        
    }
}