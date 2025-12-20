class Solution {
    public int[] rearrangeArray(int[] nums) {
     int n= nums.length;
     int[] ans= new int[n];
     int p=0 ; int ng=1;
     for(int i=0; i<n;i++){
        if(nums[i]<0){
            ans[ng]=nums[i];
            ng+=2;
        }else{
            ans[p]=nums[i];
            p+=2;
        }
     }
     return ans;  
    }
}