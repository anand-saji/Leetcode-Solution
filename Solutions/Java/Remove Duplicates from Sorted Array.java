class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null) return 0;
        if(nums.length<=1) return nums.length;
        int l=0;
        for(int r=1;r<nums.length;r++){
            if(nums[r]!=nums[l]){
                nums[++l]=nums[r];
            }

        }
        return l+1;
    }
}
