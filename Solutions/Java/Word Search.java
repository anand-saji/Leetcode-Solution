class Solution {
    boolean visited[][];
    public boolean exist(char[][] board, String word) {
        int r=board.length;
        int c=board[0].length;
        visited = new boolean[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(word.charAt(0)==board[i][j] && search(i,j,0,word,board)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean search(int i,int j, int index, String word, char[][] board){
        if(index==word.length()) return true;
        if(i<0 || j<0 || i>=board.length || j>=board[i].length || visited[i][j] ||word.charAt(index)!=board[i][j])   {
            return false;
        }
        visited[i][j]=true;
        if(search(i+1,j,index+1,word,board) || 
        search(i-1,j,index+1,word,board) || 
        search(i,j+1,index+1,word,board) || 
        search(i,j-1,index+1,word,board)) {
               return true;
        }
        visited[i][j] = false;
        return false;
    }
}
