class Solution {
    public int maxPoints(int[][] p) {
        int n = p.length;
        if(n<=2) return n;

        int ans=2;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp =2;

                for(int k=0;k<n;k++){
                    if(k!=i && k!=j){
                        int x=  (p[k][1] -p[i][1])*(p[j][0] -p[i][0] );
                        int y=  (p[j][1] -p[i][1])*(p[k][0] -p[i][0] );
                        if(x==y)   
                            {temp++;}
                    }
                }

                if(temp>ans)    ans=temp;
            }
        }
        return ans;
    }
}

// Algorithm 
// 1. take count. if count<=2 return count
// 2. outer for loop
// 3. inner for loop for next maxPoints
// 4. temp =2
// 5. for loop for all points except outer and inner points
// 6. if 3 points satisfy slope condition, then temp++
// 7. if temp> ans ; update ans
// 8. return ans;
