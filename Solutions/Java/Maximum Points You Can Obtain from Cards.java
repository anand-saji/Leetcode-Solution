class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int wsum=0;
        int n=cardPoints.length;
        int ans=0;
        int total=0;
        for(int i=0;i<n;i++){
            total+=cardPoints[i];
        }
        for(int i=0;i<n-k;++i){
            wsum+=cardPoints[i];
        }
        ans = total-wsum;
        for(int i=0;i<k;++i){
            wsum-=cardPoints[i];
            wsum+=cardPoints[i+n-k];
            ans = Math.max(ans,total-wsum);
        }
        return ans;   
    }
}

// Algorithm
// 1. find total sum
// 2. find window_sum (length - k)
// 3. iterate window for k times, calculate each window_sum
// 4. return ans = max (total - window_sum)  
