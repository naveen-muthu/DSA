class Solution {
    public boolean isPowerOfTwo(int n) {
        List<Integer> root=new ArrayList<>();
        for(int i=0;i<=30;i++){
            int k=(int) Math.pow(2,i);
            root.add(k);
        }
        if(root.contains(n)){
            return true;
        }
        else{
            return false;
        }
        
    }
}