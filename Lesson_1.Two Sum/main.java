 // Description: This file contains the main class for the Java application. 
public class Main {
    public static void main(String[] args) {
        System.out.println("Đây là bài một trong chuỗi Series bài tập Java của tôi.");

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Main main = new Main();
        int[] result = main.twoSum(nums, target);

        if (result != null) {
            System.out.println("Kết quả: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("Không tìm thấy hai số nào có tổng bằng " + target);
        }

    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();//số và vị trí của nó
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; //tìm số cần thiết để đạt được tổng

            if (map.containsKey(complement)) { //nếu số cần thiết đã có trong map
                return new int[] { map.get(complement), i }; //trả về vị trí của hai số
            }
            map.put(nums[i], i); //thêm số và vị trí của nó vào map
        }
        return null; //nếu không tìm thấy, trả về null
        
    }
}    