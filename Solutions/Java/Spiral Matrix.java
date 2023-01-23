class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length==0) return new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
         int m = matrix.length;
         int n = matrix[0].length;

         int r1=0;
         int r2=m-1;
         int c1=0;
         int c2=n-1;

         while(ans.size()<m*n){ 
            for(int i=c1; i<=c2 && ans.size() < m*n ; ++i)
                ans.add(matrix[r1][i]);
            for(int i=r1+1; i<=r2-1 && ans.size() < m*n ; ++i)
                ans.add(matrix[i][c2]);
            for(int i=c2; i>=c1 && ans.size() < m*n ; --i)
                ans.add(matrix[r2][i]);
            for(int i=r2-1; i>=r1+1 && ans.size() < m*n ; --i)
                ans.add(matrix[i][c1]);
            ++r1;
            ++c1;
            --r2;
            --c2;
         }
         return ans;
    
    }
}

// Algorithm
// 1. while size of array < row*col
// 2. first row -> last column -> last row -> first column
// 3. return array
