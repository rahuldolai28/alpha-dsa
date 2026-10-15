import java.util.HashMap;

public class ValidAnagram {
    // Valid Anagram
    // Given two strings s and t, return true if t is an anagram of s, and false
    // otherwise.
    // An Anagram is a word or phrase formed by rearranging the letters of a
    // different word or phrase,
    // typically using all the original letters exactly once.
    // s = "race" t="care" TRUE
    // s = "heart" t="earth" TRUE
    // S = "tulip" t = "lipid" FALSE

    public static boolean isValid(String s, String t) {
        // base case
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            if (map.containsKey(ch)) {
                int val = map.get(ch);
                if (val > 1) {
                    map.put(ch, val - 1);
                } else {
                    map.remove(ch);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aab";
        String t = "baa";
        System.out.println(isValid(s, t));
    }

}
