class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> og=new ArrayList<>();
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        for(int i=min;i<=max;i++){
            og.add(i);
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<og.size();j++){
                if(nums[i]==og.get(j)){
                    og.remove(j);
                }
            }
        }
        return og;

    }
}