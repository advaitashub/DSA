class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int j=nums.length-k;
        int[] part1 = Arrays.copyOfRange(nums, 0, j);
        int[] part2 = Arrays.copyOfRange(nums, j, nums.length);
        
        // int[] nums = new int[nums.length];
        System.arraycopy(part2, 0, nums, 0, part2.length);
        // Copy part1
        System.arraycopy(part1, 0, nums, part2.length, part1.length);

        System.out.println(Arrays.toString(nums));

    }
}