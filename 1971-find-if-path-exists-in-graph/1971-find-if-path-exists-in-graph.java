class Solution {

    public boolean dfs(int source , int destination , HashMap<Integer, List<Integer>> adjList , boolean[] visited)
    {
        if(source == destination) return true;

        visited[source] = true;

        for(int nei : adjList.get(source))
        {
            if(!visited[nei])
            {
                if(dfs(nei , destination , adjList , visited)) return true;
            }
        } 
        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) 
    {
        HashMap<Integer, List<Integer>> adjList = new HashMap<>();

        for(int i = 0 ; i < n ; i++)
            adjList.put(i, new ArrayList<>());

        for(int i = 0 ; i < edges.length ; i++)
        {
            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);
        }

        boolean[] visited = new boolean[n];

        return dfs(source, destination , adjList , visited);
    }
}