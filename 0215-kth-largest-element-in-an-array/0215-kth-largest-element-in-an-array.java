class Solution {
    public int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i = 0 ; i < nums.length ; i++)
        {
            queue.add(nums[i] * (-1));
        }

        while(k > 1)
        {
            queue.poll();
            k--;
        }

        return queue.peek() * (-1);
    }
}