class Solution {
    public int[] nextGreaterElements(int[] nums) 
    {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[nums.length];

        for(int i = 2*nums.length - 1 ; i >= 0 ; i--)
        {
            while(!st.isEmpty() && st.peek() <= nums[i % nums.length])
                st.pop();

            if(i < nums.length)
                res[i] = st.isEmpty() ? -1 : st.peek();
            
            st.push(nums[i % nums.length]);
        }
        return res;
    }
}