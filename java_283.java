package leetcode;

/**
 * leetcode_283
 * 
 * Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements.
 * 
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
 * should be [1, 3, 12, 0, 0].
 * 
 * Note: You must do this in-place without making a copy of the array. Minimize
 * the total number of operations.
 * 
 * @author rwxn
 *
 */
public class java_283 {
	public void moveZeroes(int[] nums) {
		int i = 0, j = nums.length - 1;

		int tmp = 0;
		while (i < j) {
			while (nums[i] != 0) {
				i++;
				if (i > j) {
					break;
				}
			}
			while (nums[j] == 0) {
				j--;
				if (j < i) {
					break;
				}
			}

			int k = i + 1;
			while (k <= j) {
				if (nums[k] != 0) {
					tmp = nums[k];
					nums[k] = nums[i];
					nums[i] = tmp;
					i = i + 1;
					k = i + 1;
				} else {
					k++;
				}
			}
		}
	}
}
