class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue <Integer> minheap = new PriorityQueue<>();

        for(int num:nums){
            minheap.offer(num);
            while(minheap.size()>k)
                minheap.poll();
        }

        return minheap.peek();
    }
}
