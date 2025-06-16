import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Đây là bài một trong chuỗi Series bài tập Java của tôi.");

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);

        if (result != null) {
            System.out.println("Kết quả: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("Không tìm thấy hai số nào có tổng bằng " + target);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
