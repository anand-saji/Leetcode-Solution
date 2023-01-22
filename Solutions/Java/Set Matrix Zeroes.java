class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        boolean row =false, col=false;

        for(int i=0;i<r;i++) if(matrix[i][0]==0) col=true; //if  any element in first r/c is zero, then flag is set to true
        for(int j=0;j<c;j++) if(matrix[0][j]==0) row=true;

        for(int i=1;i<r;i++){               //if r/c elements are zero, then flag r/c arese tot zero.
            for(int j=1;j<c;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=1;i<r;i++){ 
                if(matrix[i][0]==0){
                    for(int j=1;j<c;j++){
                        matrix[i][j]=0;
                    }
                }
            
        }

        for(int j=1;j<c;j++){ 
            if(matrix[0][j]==0){
                for(int i=1;i<r;i++){
                    matrix[i][j]=0;
                }
            }            
        }
        if(row){
            for(int j=0;j<c;j++){
                matrix[0][j]=0;
            }
        }
        if(col){
            for(int i=0;i<r;i++){
                matrix[i][0]=0;
            }
        }
    }
}
