class Solution {
    // 111524202055 Surendhar L
    public int nearestExit(char[][] maze, int[] entrance) {
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {entrance[0],entrance[1]});
        int size = q.size();
        int count = 1;
        int[] d = {0,-1,0,1,0};
        while(!q.isEmpty()){
            int[] arr = q.poll();
            size--;
            int row = arr[0];
            int col = arr[1];
            for(int i=0;i<4;i++){
                row = arr[0]+d[i];
                col = arr[1]+d[i+1];
                if(row < 0 || col < 0 || row >= maze.length || col >= maze[0].length){
                    continue;
                }
                if((row == 0 || col == 0 || row == maze.length-1 || col == maze[0].length-1) && !visited[row][col] && maze[row][col] == '.'){
                    if(row != entrance[0] || col != entrance[1]){
                        return count;
                    }
                }
                // visited[row][col] = true;
                if(!visited[row][col] && maze[row][col] == '.'){
                    q.add(new int[]{row,col});
                }
                visited[row][col] = true;
            }
            row = arr[0];
            col = arr[1];
            if(size == 0){
                size = q.size();
                if(row == entrance[0] && col == entrance[1] && q.size() == 0){
                    return -1;
                }
                count++;
            }
        }
        return -1;
    }
}