class Solution {
    public int thirdMax(int[] nums) {
        long f_max = Long.MIN_VALUE;
		long s_max = Long.MIN_VALUE;
		long t_max = Long.MIN_VALUE;
		
		for(int i=0;i<nums.length;i++) {
			if(f_max < nums[i])
			{
				t_max = s_max;
				s_max = f_max;
				f_max = nums[i];
			}
			else if( s_max < nums[i] && nums[i] != f_max)
			{
				t_max = s_max;
				s_max = nums[i];
			}
			
			else if(t_max < nums[i] && nums[i] != f_max && nums[i] != s_max)
			{
				t_max = nums[i];
			}
		}
		if(t_max == Long.MIN_VALUE) {
			return (int)f_max;
		}
            return (int)t_max;
    }
}