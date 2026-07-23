class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> iso = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++)
        {
            if(!iso.containsValue(t.charAt(i)))
                iso.put(s.charAt(i), t.charAt(i));
            else
                continue;
        }

        String res = "";
        for(int i = 0 ; i < s.length() ; i++)
        {
            res += iso.get(s.charAt(i));
        }

        return res.equals(t);
    }
}