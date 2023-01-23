class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res=1;
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
                if(map.get(i)>nums.length/2)    res = i;
            }
            else    map.put(i,1);
        }
        return res;
    }
}

// Algorithm
// 1. create HashMap (element and count)
// 2. for each element 
// 3. if element is present increment count
// 4. else insert element and count in map
// 5. if count is greater than n/2, result = element
// 6. return result
