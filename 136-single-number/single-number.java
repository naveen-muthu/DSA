class Solution {
    public int singleNumber(int[] nums) {
        int flags = 0;
        for (int num : nums) {
            flags = flags ^ num;
        }
        return flags;
    }
}