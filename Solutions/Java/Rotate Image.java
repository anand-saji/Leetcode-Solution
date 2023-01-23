class Solution {
    public void rotate(int[][] matrix) {
         int N = matrix.length;
        //  int M = matrix[0].length;
        for(int i=0;i<N;i++){           //transpose
            for(int j=i;j<N;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<N;i++){           //horizontal flip
            for(int j=0;j<(N/2);j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][N-1-j];
                matrix[i][N-1-j]=temp;
            }
        }

    }
}

// Algorithm
// 1. Transpose
// 2. Horizontal flip
