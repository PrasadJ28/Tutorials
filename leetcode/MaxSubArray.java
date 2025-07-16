
//Solution to problem 643 Maximum Average SubArray 1 using sliding window
class Solution {

	public double findMaxAvergae(int[] nums, int k) {
		double result = 0;
		double temp = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (i < k) {
				temp += nums[i];
				result = temp;
			} else {
				temp = temp - nums[i - k] + nums[i];
				if (temp > result) {
					result = temp;
				}
			}
		}
		return result / k;

	}
}

class MaxSubArray {
	public static void main(String args[]) {
		Solution solution = new Solution();
		int k = 4;
		int[] nums = { 1, 12, -5, -6, 50, 3 };
		double result = solution.findMaxAvergae(nums, k);
		System.out.println("reuslt = " + result);
	}
}
