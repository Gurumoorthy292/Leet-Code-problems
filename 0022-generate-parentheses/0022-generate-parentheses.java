class Solution {


    static void garu(int left , int right , int n , String s , ArrayList<String> vanget){


        //base condition
        if(s.length() == n*2){
            vanget.add(s);
            return;
        }

        if(left < n)
            garu(left+1 , right , n , s+"(" , vanget);
        if(right < left)
            garu(left , right+1 , n , s+")" , vanget);


    }
    public List<String> generateParenthesis(int n) {
        
        ArrayList<String> vanget = new ArrayList<>();

        garu( 0 , 0 , n , "" , vanget);

        return vanget;
    }
}