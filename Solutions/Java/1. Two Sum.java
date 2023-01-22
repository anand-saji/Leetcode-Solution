//Algorithm

/* 
1.hash map, (0,1), (element, index)
2.for each element, find complement,
3. check if complement is in map, if found, get index, else put into map
4. return i and index from complement
*/

=====================

class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map <Integer,Integer> new_map = new HashMap<>();
       for(int i=0;i<nums.length;i++){
           int complement = target-nums[i];
           if(new_map.containsKey(complement)){
               return new int[] {new_map.get(complement),i};
           }
           else new_map.put(nums[i],i);
       } 
       throw new IllegalArgumentException("no matches");
    }
}

