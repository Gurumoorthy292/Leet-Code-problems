class Pair
{
    char c;
    int freq;

    public Pair(char c , int freq)
    {
        this.c = c;
        this.freq = freq;
    }
}

class Solution {
    public String removeDuplicates(String s, int k) 
    {
        Stack<Pair> st = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++)
        {
            if(!st.isEmpty() && st.peek().c == s.charAt(i))
            {
                st.peek().freq++;
                if(st.peek().freq == k)
                    st.pop();
            }
            else
                st.push(new Pair(s.charAt(i) , 1));
        }

        String str = "";
        while(!st.isEmpty())
        {
            int n = st.peek().freq;
            char ch = st.peek().c;
            for(int i = 0 ; i < n ; i++)
                str = ch + str;
            
            st.pop();
        }
           return str; 
    }
}