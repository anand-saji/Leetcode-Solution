class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] sum = new int[k];
        int s=0;
        int rem=0;
        int total=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            rem=s%k;
            if(rem<0) rem+=k;
            sum[rem]++;
        }
        for(int r:sum){
            total+=(r*(r-1)/2);
        }
        return total+sum[0];
    }
}
