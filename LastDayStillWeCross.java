import java.util.*;
// 111524202055 Surendhar l
class Solution {

    int[] d={-1,0,1,0,-1};

    public boolean canCross(int[][] cells,int row,int col,int day){

        int[][] grid=new int[row][col];

        for(int i=0;i<day;i++){
            int r=cells[i][0]-1;
            int c=cells[i][1]-1;
            grid[r][c]=1;
        }

        Queue<int[]> q=new LinkedList<>();
        boolean[][] vis=new boolean[row][col];

        for(int c=0;c<col;c++){

            if(grid[0][c]==0){
                q.add(new int[]{0,c});
                vis[0][c]=true;
            }
        }

        while(!q.isEmpty()){

            int[] curr=q.poll();

            int r=curr[0];
            int c=curr[1];

            if(r==row-1)
                return true;

            for(int i=0;i<4;i++){

                int nr=r+d[i];
                int nc=c+d[i+1];

                if(nr>=0 && nr<row &&
                   nc>=0 && nc<col &&
                   grid[nr][nc]==0 &&
                   !vis[nr][nc]){

                    vis[nr][nc]=true;
                    q.add(new int[]{nr,nc});
                }
            }
        }

        return false;
    }

    public int latestDayToCross(int row,int col,int[][] cells){

        int low=1;
        int high=cells.length;
        int ans=0;

        while(low<=high){

            int mid=(low+high)/2;

            if(canCross(cells,row,col,mid)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        return ans;
    }
}