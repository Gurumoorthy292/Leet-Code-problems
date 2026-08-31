class Solution {

    public int dfs(int row , int col , int[][] grid , boolean[][] visited)
    {
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length)
            return 1;
        if(visited[row][col] )
            return 0;
        if(grid[row][col] != 1)
            return 1;
        
        visited[row][col] = true;

        int down = dfs(row + 1 , col , grid , visited);
        int up = dfs(row - 1 , col , grid , visited);
        int right = dfs(row , col + 1 , grid , visited);
        int left = dfs(row , col - 1 , grid , visited);

        return (left + right + up + down);
    }

    public int islandPerimeter(int[][] grid) 
    {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int ans = 0;
        for(int i = 0 ; i < grid.length ; i++)
        {
            for(int j = 0 ; j < grid[0].length ; j++)
            {
                if(!visited[i][j] && grid[i][j] == 1)
                {
                    ans = dfs(i , j , grid , visited);
                }
            }
        }
        return ans;
    }
}