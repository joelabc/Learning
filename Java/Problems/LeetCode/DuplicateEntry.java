package LeetCode;


class Solution {
    public boolean containsDuplicate(int[] nums) {
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j])
                    return true;
            }}return false;
        }
    }

public class DuplicateEntry {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] n1 = {'1', '2', '2'};
        int[] n2 = {'1', '1', '1', '3', '3', '4', '3', '2', '4', '2'};
        int[] n3 = {'1', '2', '3'};
        System.out.println(s.containsDuplicate(n2));
    }
}
