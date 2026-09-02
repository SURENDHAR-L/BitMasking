import java.util.*;
// 111524202055
class Solution {

    int[] d={-1,0,1,0,-1};

    public boolean exist(char[][] board,String word){

        int R=board.length;
        int C=board[0].length;

        boolean[][] vis=new boolean[R][C];

        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){

                if(board[row][col]==word.charAt(0)){

                    if(dfs(board,word,row,col,0,vis)){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean dfs(char[][] board,String word,
                       int row,int col,int idx,
                       boolean[][] vis){

        if(idx==word.length()){
            return true;
        }

        int R=board.length;
        int C=board[0].length;

        if(row<0 || row>=R ||
           col<0 || col>=C ||
           vis[row][col] ||
           board[row][col]!=word.charAt(idx)){
            return false;
        }

        vis[row][col]=true;

        for(int i=0;i<4;i++){

            int nr=row+d[i];
            int nc=col+d[i+1];

            if(dfs(board,word,nr,nc,idx+1,vis)){
                return true;
            }
        }

        vis[row][col]=false;

        return false;
    }
}