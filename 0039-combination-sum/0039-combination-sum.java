class Solution {

    public void backtrack(int[] candidates , int st , int target , List<List<Integer>> result , List<Integer> list)
    {
        if( target == 0 )
        {
            result.add(new ArrayList<>(list));
            return;
        }

        if(target < 0) return;

        for(int i = st ; i < candidates.length ; i++)
        {
            list.add(candidates[i]);
            backtrack(candidates , i , target - candidates[i] , result , list);
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(candidates , 0 , target , result , list);

        return result;
    }
}