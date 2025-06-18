import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("abcabcbb → " + sol.lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println("bbbbb → " + sol.lengthOfLongestSubstring("bbbbb"));       // 1
        System.out.println("pwwkew → " + sol.lengthOfLongestSubstring("pwwkew"));     // 3
    }
}
