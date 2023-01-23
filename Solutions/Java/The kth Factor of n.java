class Solution {
    public int kthFactor(int n, int k) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
                if(count==k)    return i;
            }  

        }
        return -1;
    }
}

// Algorithm
// 1. count=0
// 2. for loop ; count from 1 to n
// 3. if n%i ==0 then count++
// 4. if count==k return i;
// 5. else -1
