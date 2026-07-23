class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(int i = 0 ; i < words.length ; i++)
        {
            String word = words[i];
            String res = "";
            for(int j = 0 ; j < word.length() ; j++)
            {
                res += morseCode[word.charAt(j) - 97];
            }
            set.add(res);
        }
        return set.size();
    }
}