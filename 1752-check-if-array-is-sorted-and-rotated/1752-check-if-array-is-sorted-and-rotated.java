class Solution {
    public boolean check(int[] nums) {
        int breaks=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]){
                breaks++ ;    
            }
            if(breaks>1){
                return false;
            }
        }
        if (nums[nums.length - 1] > nums[0]) {
            breaks++;
        }
        if(breaks>1){
            return false;
        }
        return true;
    }
}