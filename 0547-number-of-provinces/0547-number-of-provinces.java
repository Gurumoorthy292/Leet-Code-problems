class Solution {

    public void dfs(int node, boolean[] visited, int[][] isConnected)
    {
        if(visited[node]) return;
        visited[node] = true;
        for(int i = 0 ; i < isConnected.length ; i++)
        {
            if(!visited[i] && isConnected[node][i] == 1)
                dfs(i, visited, isConnected);
        }
    }

    public int findCircleNum(int[][] isConnected) {
        // HashMap<Integer, List<Integer>> adj = new HashMap<>();

        // for(int i = 1 ; i <= isConnected.length ; i++)
        //     adj.put(i, new ArrayList<>());
        // for(int i = 0 ; i < isConnected.length ; i++)
        // {
        //     for(int j = 0 ; j < isConnected.length ; j++)
        //     {
        //         if(isConnected[i][j] == 1)
        //             adj.get(i + 1).add(j + 1);
        //     }
        // }

        boolean[] visited = new boolean[isConnected.length];
        int count = 0;
        for(int i = 0 ; i < isConnected.length ; i++)
        {
            if(!visited[i])
            {
                dfs(i, visited, isConnected);
                count++;
            }
        }
        return count;

    }
}