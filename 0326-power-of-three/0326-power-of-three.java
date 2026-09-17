class Solution {
    public boolean re(int n){

        if(n == 1)
            return true;
        if(n < 1 || n % 3 != 0)
            return false;
        
        return re(n/3);

    }
    public boolean isPowerOfThree(int n) {
        return re(n);
    }
}