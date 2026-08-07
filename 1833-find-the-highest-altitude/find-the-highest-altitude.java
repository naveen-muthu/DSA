class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int o=0;
        for(int i=0;i<gain.length;i++){
            int sum=o+gain[i];
            o=sum;
            int k=Math.max(max,sum);
            max=k;
        }
        return max;
        
    }
}