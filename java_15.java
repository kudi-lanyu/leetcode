package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * leetcode_15
 * 
 * Given an array S of n integers, are there elements a, b, c in S such that a +
 * b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * 
 * Note: The solution set must not contain duplicate triplets.
 * 
 * For example, given array S = [-1, 0, 1, 2, -1, -4],
 * 
 * A solution set is: [ [-1, 0, 1], [-1, -1, 2] ]
 * 
 * @author rwxn
 *
 */
public class java_15 {

	List<List<Integer>> list = new ArrayList<List<Integer>>();

	public List<List<Integer>> threeSum(int[] nums) {

		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {// 一层循环
			if (nums[i] > 0) {
				break;
			}
			if (nums[i] == 0 && i + 2 < nums.length) {
				if (nums[i + 2] == 0) {
					List<Integer> triplet = new ArrayList<Integer>();
					Collections.addAll(triplet, nums[i], nums[i + 1], nums[i + 2]);
					if (!list.contains(triplet)) {
						list.add(triplet);
					}
					break;// 有三个元素为0，添加组合后跳出
				}
				break;
			}
			if (i >= 1 && nums[i] == nums[i - 1]) {
				continue;
			}
			find_Twosum_equal_k(nums, i + 1, nums.length - 1, -nums[i]);
		}
		return list;
	}

	public void find_Twosum_equal_k(int[] num, int start, int real, int k) {
		// 注意要找到所有可能情况，无重复数对

		int j = start - 1;
		while (start < real) {

			if (num[start] + num[real] > k) {
				real--;
			} else if (num[start] + num[real] < k ) {
				start++;
			} else {
				while (num[real] == num[real - 1] && start < real-1) {
					real--;					
				}
				while (num[start] == num[start + 1] && start+1 < real) {
					start++;				
				}
				List<Integer> triplet = new ArrayList<Integer>();
				Collections.addAll(triplet, num[j], num[start], num[real]);
				if (!list.contains(triplet)) {
					list.add(triplet);
				}
				start++;
				real--;
			}
		}
	}
}
