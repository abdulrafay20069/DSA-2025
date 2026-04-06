package HashMap;

import java.util.HashMap;

public class ValidAnagram {


    // "Approach 1 using int[26] array for lowercase letters only"

//     public static boolean isAnagram(String s, String t) {

//         // Step 1: If lengths are different → not anagram
//         if (s.length() != t.length()) {
//             return false;
//         }

//         // Step 2: Create array for 26 letters
//         int[] count = new int[26];

//         // Step 3: Count characters
//         for (int i = 0; i < s.length(); i++) {
//             count[s.charAt(i) - 'a']++;  // increase for s
//             count[t.charAt(i) - 'a']--;  // decrease for t
//         }

//         // Step 4: Check if all values are 0
//         for (int num : count) {
//             if (num != 0) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         System.out.println(isAnagram("anagram", "nagaram")); // true
//         System.out.println(isAnagram("rat", "car"));         // false
//     }



          // Approach 2: Use HashMap to count character frequencies


              public static boolean isAnagram(String s, String t) {

        // Step 1: Length check
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Create HashMap
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 3: Count characters of s
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 4: Subtract using t
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            }

            map.put(c, map.get(c) - 1);

            if (map.get(c) == 0) {
                map.remove(c);
            }
        }

        // Step 5: Check if empty
        return map.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("rat", "car"));         // false
    }


 }


