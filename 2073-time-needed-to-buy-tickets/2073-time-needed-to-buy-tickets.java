class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) 
    {
        // Queue<Integer> q = new LinkedList<>();
        // for(int i = 0 ; i < tickets.length ; i++)
        //     q.offer(tickets[i]);
        int seconds = 0;
        int n = tickets.length;

        int i = 0;
        while(tickets[k] != 0)
        {
            if(tickets[i % n] != 0)
            {
                seconds++;
                tickets[i % n] = tickets[i % n] - 1;
            }

            if(tickets[k] == 0)
            {
                break;
            }

            i++;
        }

        return seconds;
    }
}