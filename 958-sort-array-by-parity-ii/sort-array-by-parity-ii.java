class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        for(int k : nums){
            if( k%2==0){
                even.add(k);
                }
            else {
                odd.add(k);
            }
        }
        int [] ans=new int[nums.length];
        int e=0;
        int o=0;

        for(int i=0;i<nums.length;i++){
            if(i%2==0 ){
                ans[i]=even.get(e++);
            }
            else{
                ans[i]=odd.get(o++);

            }
            
        }
        return ans;

        
    }
}