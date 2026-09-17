class Solution {
    public int addDigits(int num) 
    {
        while(num > 9)
        {
            int last = num % 10;
            int first = num / 10;
            num = first + last;
        }
        return num;
    }
}