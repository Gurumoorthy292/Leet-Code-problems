class Solution {
    public boolean isHappy(int n) 
    {
        int sum = n;
        Set<Integer> set = new HashSet<>();
        while(sum > 1 && !set.contains(sum)){
            set.add(sum);
            sum = 0;
            while(n != 0){
                int temp = n % 10;
                sum += (temp*temp);
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}