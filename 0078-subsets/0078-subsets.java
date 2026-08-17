class Solution {

    static void backtrack(int i, int[] nums, ArrayList<Integer> sub, List<List<Integer>> result)
    {
        if(i == nums.length)
        {
            result.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[i]);
        backtrack(i + 1, nums, sub, result);

        sub.remove(sub.size() - 1);
        backtrack(i + 1, nums, sub, result);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);

        return result;
    }
}