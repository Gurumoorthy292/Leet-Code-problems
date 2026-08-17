class Solution {
    static void f(int left, int right, char[] s)
    {
        if(left >= right) return;

        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        f(left + 1, right - 1 , s);
    }
    public void reverseString(char[] s) {
        f(0, s.length - 1, s);
    }
}