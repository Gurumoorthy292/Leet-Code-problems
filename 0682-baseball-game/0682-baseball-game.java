class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        
        for(String str : operations)
        {
            if(str.equals("+"))
            {
                int first = st.pop();
                int second = st.peek();
                int third = first + second;
                st.push(first);
                st.push(third);
            }
            else if(str.equals("D"))
                st.push(st.peek() * 2);
            else if(str.equals("C"))
                st.pop();
            else
                st.push(Integer.parseInt(str));
        }
        int res = 0;
        while(!st.isEmpty())
            res += st.pop();

        return res;
    }
}