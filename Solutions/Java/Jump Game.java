class Solution {
    public boolean canJump(int[] nums) {
        int last = nums.length -1;
        for(int i=last;i>=0;i--){
            if(i+nums[i]>=last){
                last=i;
            }
        }
        return last==0;
    }
}

// Algorithm
// 1. going backward from last index to first index
// 2. last = length-1
// 3. if last index can be obtained from previous index then set that previous index as lastgood
// 4. repeat until for loop
// 5. if lastgood==first index then return true
