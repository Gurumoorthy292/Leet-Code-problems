class Solution {
    public int mySqrt(int x) {
        int prev = 0;
        int a = 0;
        if(x == 1) return 1;
        if(x == 0) return 0;
        for(long i = 1 ; i <= (x / 2) + 1 ; i++)
        {
            prev = a;
            a = (int)i;
            if(i * i == x)
                return (int)i;
            if(i * i > x)
                return prev;
        }
        return prev;
    }
}