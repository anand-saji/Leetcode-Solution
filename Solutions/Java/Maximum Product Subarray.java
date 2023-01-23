class Solution {
    public int maxProduct(int[] nums) {
        
        int ans = nums[0];
        int dpmin=nums[0];
        int dpmax=nums[0];

        for(int i=1;i<nums.length;i++){
            int prevmax=dpmax;
            int prevmin=dpmin;

            if(nums[i]>0){
                dpmin=Math.min(nums[i]*prevmin,nums[i]);
                dpmax=Math.max(nums[i]*prevmax,nums[i]);                
            }
            else{
                dpmin=Math.min(nums[i]*prevmax,nums[i]);
                dpmax=Math.max(nums[i]*prevmin,nums[i]);
            }
            ans=Math.max(ans,dpmax);
        }
        return ans;
    }
}
