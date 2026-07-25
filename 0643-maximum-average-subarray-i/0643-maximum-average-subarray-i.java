class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s = 0;
        double maxSum = Double.NEGATIVE_INFINITY;
        double sum = 0;
        for (int e = 0; e < nums.length; e++) {
            sum += nums[e];

            if (k == e - s + 1) {
                double avg = sum / k;
                maxSum = Math.max(maxSum, avg);
                sum -= nums[s];
                s++;
            }
        }
        return maxSum;

    }
}