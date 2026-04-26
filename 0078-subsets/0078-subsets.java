import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        rec(0, nums, subset, ans);
        return ans;
    }

    private void rec(int idx, int[] nums, List<Integer> subset, List<List<Integer>> ans) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(subset)); // add a copy of current subset
            return;
        }

        // Include nums[idx]
        subset.add(nums[idx]);
        rec(idx + 1, nums, subset, ans);

        // Exclude nums[idx]
        subset.remove(subset.size() - 1);
        rec(idx + 1, nums, subset, ans);
    }
}
