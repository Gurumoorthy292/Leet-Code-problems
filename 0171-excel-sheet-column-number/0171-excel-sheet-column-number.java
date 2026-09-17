class Solution {
    public int titleToNumber(String c) {
        
        int ans = 0;
        int p = 0;

        for(int  i  = c.length() - 1 ; i >= 0 ; i--){
            ans += (c.charAt(i) - 64) * Math.pow(26 , p);
            p++;
        }
        return ans;
    }
}