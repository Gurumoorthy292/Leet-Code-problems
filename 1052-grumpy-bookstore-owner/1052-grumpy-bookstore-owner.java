class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied = 0;
        for(int i = 0 ; i < customers.length ; i++)
        {
            if(grumpy[i] == 0)
                satisfied += customers[i];
        }
        
        int win = 0;
        for(int i = 0 ; i < minutes ; i++){
            if(grumpy[i] == 1)
                win += customers[i];
        }
        int s = 0;
        int e = minutes - 1;
        int maxi = win;

        while(e < customers.length - 1)
        {
            if(grumpy[s] == 1)
                win -= customers[s];

            s++;
            e++;

            if(grumpy[e] == 1)
                win += customers[e];

            maxi = Math.max(maxi, win);
        }
        
        return satisfied + maxi;
    }
}