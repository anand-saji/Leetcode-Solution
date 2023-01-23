class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(0,1);
        int sum=0;
        int res=0;
        // int n=nums.length; 
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(hash.containsKey(sum-k)){
                res+=hash.get(sum-k);
            }
            hash.put(sum,hash.getOrDefault(sum,0)+1);
        }
        return res;
    }
}


// Algorithm
// 1. hashmap (0,1)
// 2. for loop; find sum[i]; insert into hashmap (sum, occurances)
// 3. if hash contains (sum - k) then add value to result;
// 4. return result
