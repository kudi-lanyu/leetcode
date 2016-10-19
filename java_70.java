package leetcode;

/**
 * leetcode_70 You are climbing a stair case. It takes n steps to reach to the
 * top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
 * you climb to the top?
 * 
 * 
 * solution.
 * 
 * 1.�����ж�����2�����������һ��2����������1��10��2����������1 .
 * 
 * 2.����ÿ������Ŀ����������.
 * 
 * ������㷨�����������.
 *
 * �����㷨�����Ϊ쳲���������.
 *
 * @author rwxn
 *
 */
public class java_70 {
	public int climbStairs(int n) {
		int[] count = new int[n + 3];
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		count[0] = 1;
		count[1] = 1;
		count[2] = 2;
		for (int i = 3; i <= n; ++i)
			count[i] = count[i - 1] + count[i - 2];
		return count[n];
	}
}
// public int climbStairs(int n) {
// int result = 0;
// if (n == 0 || n == 1) {
// return 1;
// }
//
// for (int count = n / 2; count >= 0; count--) {
// result = result + arrangement(n - count, count);
// }
// return result;
// }
//
// public int arrangement(int n, int m) {// ����C
// int result = 0;
// long fenzi = 1, fenmu_1 = 1,fenmu_2 = 1;
// if (n == m || m == 0) {
// return result = 1;
// }
//
// for(int i = n;i>=0;i--){
// if(i == 0){
// fenzi = fenzi * 1;
// }else {
// fenzi = fenzi*i;
// }
// }
// for(int i = m;i>0;i--){
// fenmu_1 = fenmu_1*i;
// }
// for(int i =n- m;i>0;i--){
// fenmu_2 = fenmu_2*i;
// }
// System.out.println(fenzi/(fenmu_1*fenmu_2));
// result = (int)(fenzi/(fenmu_1*fenmu_2));
//
//
//// if (n - m == m && m == 1) {
//// result = 2;
//// } else if (n - m > m) {
////
//// for (int i = n - m + 1; i <= n; i++) {
//// fenzi = fenzi * i;
//// }
//// for (int i = m; i >= 1; i--) {
//// fenmu = fenmu * i;
//// }
//// // result = (int) Math.floor(fenzi / fenmu);
//// result = (int) (fenzi / fenmu);
//// } else{
//// for (int i = m + 1; i < n; i++) {
//// fenzi = fenzi * i;
//// }
//// for (int i = n - m; i >= 1; i--) {
//// fenmu = fenmu * i;
//// }
//// result = (int) (fenzi / fenmu);
//// }
//
// return result;
// }
