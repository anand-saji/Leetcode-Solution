class Solution {
    public int minMoves(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int min = Arrays.stream(nums).min().getAsInt();
        return sum - min * nums.length;
    }
}
