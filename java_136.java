package leetcode;

/**
 * leetcode_136
 * 
 * Given an array of integers, every element appears twice except for one. Find
 * that single one.
 * 
 * @author rwxn
 *
 */
public class java_136 {
	public int singleNumber(int[] nums) {
		int len = nums.length;
		int result = 0;
		for (int i = 0; i < len; i++) {
			result = result ^ nums[i];
		}
		return result;
	}
}
