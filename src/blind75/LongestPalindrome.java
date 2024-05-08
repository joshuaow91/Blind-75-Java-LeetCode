package blind75;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        for (Map.Entry<Character, Integer> vals : map.entrySet()) {
            if (vals.getValue() % 2 != 0) {
                oddCount++;
            }
        }

        if (oddCount > 0) {
            return s.length() - oddCount + 1;
        } else {
            return s.length();
        }
    }
}


//Given a string s which consists of lowercase or uppercase letters, return the length of
// the longest palindrome that can be built with those letters.
//
//Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
//
//
//
//Example 1:
//
//Input: s = "abccccdd"
//Output: 7
//Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
//Example 2:
//
//Input: s = "a"
//Output: 1
//Explanation: The longest palindrome that can be built is "a", whose length is 1.