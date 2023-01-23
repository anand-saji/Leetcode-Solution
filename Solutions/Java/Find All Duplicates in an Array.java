class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> output=new ArrayList();
        int[] freq = new int[nums.length+1];
        for(int num:nums)   freq[num]++;
        for(int i=0;i<freq.length;i++)  if(freq[i]==2)  output.add(i);
        return output;
    }
}
