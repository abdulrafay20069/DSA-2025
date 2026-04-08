package HashMap;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        
        //  Add all elements to HashSet
        for (int num : nums) {
            set.add(num);
        }
        
        int longest = 0;
        
        //  Check each number
        for (int num : set) {
            
            // Only start if it's the beginning of a sequence
            if (!set.contains(num - 1)) {
                
                int currentNum = num;
                int count = 1;
                
                //  Keep checking next numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                
                longest = Math.max(longest, count);
            }
        }
        
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums)); 
    }
}
