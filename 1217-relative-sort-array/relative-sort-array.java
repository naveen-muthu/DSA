class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        int newarr[]=new int[arr1.length];
        int count=0;
        boolean[] used = new boolean[arr1.length];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    newarr[count]=arr1[j];
                    used[j] = true;
                    count++;
                }

            }
        }
         for (int i = 0; i < arr1.length; i++) {
            if (!used[i]) {
                newarr[count] = arr1[i];
                count++;
            }
        }
        return newarr;
    }
}