class Solution:
    def knightDialer(self, n: int) -> int:
        dp=[1]*10
        mod = 1000000007
        for i in range (2,n+1):
            old=dp.copy()
            dp[0]=old[4]+old[6]
            dp[1]=old[8]+old[6]
            dp[2]=old[7]+old[9]
            dp[3]=old[4]+old[8]
            dp[4]=old[3]+old[9]+old[0]
            dp[5]=0
            dp[6]=old[1]+old[7]+old[0]
            dp[7]=old[2]+old[6]
            dp[8]=old[1]+old[3]
            dp[9]=old[4]+old[2]
            
        return sum(dp)%mod
