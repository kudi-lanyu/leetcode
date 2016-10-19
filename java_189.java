package leetcode;

/**
 * Rotate an array of n elements to the right by k steps.
 * 
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to
 * [5,6,7,1,2,3,4].
 * 
 * @author rwxn
 *
 */

public class java_189 {
	public void rotate(int[] nums, int k) {
		int temp = k % nums.length;
		Reverse(nums, 0, nums.length - temp - 1);
		Reverse(nums, nums.length - temp, nums.length - 1);
		Reverse(nums, 0, nums.length - 1);
	}

	// public void rotate(int[] nums, int k) {
	// int len = nums.length;
	// // tmp_1用作记录要更新至新位置的值,tmp_2用作记录下次要更新位置的值
	// int tmp_1, tmp_2;
	//
	// if(k == 0){
	// return;
	// }
	//
	// for (int i = 0; i < k; i++) {
	// if(i >= len){
	// return;
	// }
	// tmp_1 = nums[i];
	// for (int j = i;;) {
	// // j+k越界就直接复制
	// if (j >= len - 1) {
	// nums[i] = tmp_1;
	// break;
	// } else if ((j + k) > len - 1) {
	// nums[i] = tmp_1;
	// break;
	// } else {
	// // 完成转移
	// tmp_2 = nums[j + k];
	// nums[j + k] = tmp_1;
	// // 更新下标
	// tmp_1 = tmp_2;
	// j = j + k;
	// }
	// }
	// }
	//
	// // 分情况处理0 到 k-1的正确顺序
	// // len%k == 0 也要做处理
	// if (len % k != 0) {
	// tmp_1 = len % k;
	// Reverse(nums, 0, tmp_1 - 1);
	// Reverse(nums, tmp_1, k - 1);
	// Reverse(nums, 0, k - 1);
	// }
	//
	// // else{
	// // Reverse(nums, 0, k-1);
	// // }
	// }

	public void Reverse(int[] array, int m, int n) {
		int i = 0;
		int tmp;
		while ((m + i) < (n - i)) {
			tmp = array[n - i];
			array[n - i] = array[m + i];
			array[m + i] = tmp;
			++i;
		}
	}
}
