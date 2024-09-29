package rocks.somesandwich.leetcode;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        solution.twoSum(new int[]{2, 7, 11, 15}, 9);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < nums.length; ++i) {
                Integer idx = hm.get(target - nums[i]);
                if (idx == null)
                    hm.put(nums[i], i);
                else
                    return new int[]{idx.intValue(), i};
            }
            return new int[0];
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}