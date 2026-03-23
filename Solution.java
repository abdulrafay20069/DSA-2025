import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int cur = nums[i];
            int x = target - cur;

            if (map.containsKey(x)){
                return new int[] { map.get(x), i };
            }
            map.put(cur, i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Solution obj = new Solution();
        int[] result = obj.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}