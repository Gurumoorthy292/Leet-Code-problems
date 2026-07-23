class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) 
    {
        List<String> list = new ArrayList<>();

        for(int i = 0 ; i < words.length ; i++)
        {
            HashMap<Character, Character> map = new HashMap<>();
            String str = words[i];
            for (int j = 0 ; j < pattern.length() ; j++)
            {
                if(!map.containsValue(str.charAt(j)))
                    map.put(pattern.charAt(j), str.charAt(j));
                else
                    continue;
            }
            String check = "";
            for (int j = 0 ; j < pattern.length() ; j++)
            {
                check += map.get(pattern.charAt(j));
            }
            if(str.equals(check)){
                list.add(str);
            }
        }
        return list;
    }
}