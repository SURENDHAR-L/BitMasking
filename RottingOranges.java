class Solution {
    // 111524202055 Surendhar L
    public int orangesRotting(int[][] grid) {
        int count = -1;
        Queue<int[]> q = new LinkedList<>();
        int oranges = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }
                if(grid[i][j] != 0){
                    oranges++;
                }
            }
        }
        if(oranges == 0) return 0;
        int[] d = {0,-1,0,1,0};
        int size = q.size();
        while(!q.isEmpty()){
            int[] arr = q.poll();
            size--;
            oranges--;
            for(int i=0;i<4;i++){
                int row = arr[0]+d[i];
                int col = arr[1]+d[i+1];
                if(row >=0 && col >=  0 && row < grid.length && col < grid[0].length && grid[row][col] == 1){
                    grid[row][col] = 2;
                    q.add(new int[]{row,col});
                }
            }
            if(size == 0){
                count++;
                size = q.size();
            }

        }
        return oranges == 0 ? count : -1;
    }
}
 