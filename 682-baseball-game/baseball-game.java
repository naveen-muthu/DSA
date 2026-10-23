class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> nums=new Stack<>();
        int total=0;
        for(int i=0;i<operations.length;i++){
            if (!operations[i].equals("D") && !operations[i].equals("C") && !operations[i].equals("+")) {
                int k = Integer.parseInt(operations[i]);
                nums.push(k);
            }
            else if(operations[i].equals("D")){
                nums.push(2*nums.peek());

            }
            else if(operations[i].equals("C")){
                nums.pop();
                
            }
            else if(operations[i].equals("+")){
                int sum = nums.get(nums.size() - 1) + nums.get(nums.size() - 2);
                nums.push(sum);
                
            }

        }
        for(int i=0;i<nums.size();i++){
            total+=nums.get(i);
        }
        if(total==0){
            return 0;
        }
        else {
            return total;
        }


    }
}