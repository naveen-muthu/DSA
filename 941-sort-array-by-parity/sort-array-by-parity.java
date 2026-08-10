class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        
        for(int i : nums){
            if(i%2==0){
                even.add(i);
            }
            else{
                odd.add(i);
            }
        }
        int [] out=new int[odd.size()+even.size()];
        for(int i=0;i<even.size();i++){
            out[i]=even.get(i);
        }
        for(int i=0;i<odd.size();i++){
            out[even.size()+i]=odd.get(i);
        }
        return out;

        
    }
}