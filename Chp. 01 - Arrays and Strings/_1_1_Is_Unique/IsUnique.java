package _1_1_Is_Unique;

import java.util.HashSet;

// Should ask interviewer if String is ASCII or Unicode (We assume ASCII)

public class IsUnique {
    private static final int NUM_ASCII_CHARS = 256; // number of ASCII characters

    public static boolean uniqueCharacters(String str) {
        if (str.length() > NUM_ASCII_CHARS) {
            return false;
        }
        HashSet<Character> mySet = new HashSet<>(NUM_ASCII_CHARS);
        for (int i = 0; i < str.length(); i++) {
            if (mySet.contains(str.charAt(i))) {
                return false;
            } else {
                mySet.add(str.charAt(i));
            }
        }
        return true;
    }
}

//  Time Complexity: O(1)
// Space Complexity: O(1)
// Checking for str.length() > 256 lowered our time/space complexity from O(n) to O(1)

// Follow-up Question: What if we're not allowed to use additional data structures?
//
// Answer: Can do brute-force O(n^2) runtime O(1) space solution by comparing all pairs
