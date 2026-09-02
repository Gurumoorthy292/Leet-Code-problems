class Solution {
    public int lastStoneWeight(int[] stones) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a , b) -> b - a
        );

        for(int i = 0 ; i < stones.length ; i++)
            pq.offer(stones[i]);
        
        while(pq.size() > 1)
        {
            int curr = pq.poll();
            int next = pq.poll();

            int newWeight = curr - next;
            if(newWeight != 0)
                pq.offer(newWeight);
        }

        return pq.isEmpty() ? 0 : pq.poll();
    }
}