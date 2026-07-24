import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sc1 = new HashMap<>();
        HashMap<Character, Integer> sc2 = new HashMap<>();

        // s ki frequency
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (sc1.containsKey(ch)) {
                int freq = sc1.get(ch);
                sc1.put(ch, freq + 1);
            } else {
                sc1.put(ch, 1);
            }
        }

        // t ki frequency
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (sc2.containsKey(ch)) {
                int freq = sc2.get(ch);
                sc2.put(ch, freq + 1);
            } else {
                sc2.put(ch, 1);
            }
        }

        return sc1.equals(sc2);
    }
}