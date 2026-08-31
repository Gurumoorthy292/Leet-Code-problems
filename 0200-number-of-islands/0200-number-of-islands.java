class Solution {

    public void dfs(int row, int col , char[][] grid, boolean[][] visited)
    {
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length)
            return;
        if(visited[row][col] || grid[row][col] != '1')
            return;
        
        visited[row][col] = true;

        dfs(row + 1 , col , grid , visited);
        dfs(row - 1 , col , grid , visited);
        dfs(row , col + 1 , grid , visited);
        dfs(row , col - 1 , grid , visited);
    }

    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        int count = 0;
        for(int i = 0 ; i < grid.length ; i++)
        {
            for(int j = 0 ; j < grid[i].length ; j++)
            {
                if(!visited[i][j] && grid[i][j] == '1')
                {
                    dfs(i , j , grid , visited);
                    count++;
                }
            }
        }
        return count;
    }
}