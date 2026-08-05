class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int count = 0;
        int left = 0;
        for(int right = 0 ; right < s.length() ; right++)
        {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

            for(char c : map.keySet()){
                if(map.get(c) > 2){
                    map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0) - 1);
                    left++;
                }
                    
            }
            count = Math.max(count, right-left+1);
        }
        return count;
    }
}