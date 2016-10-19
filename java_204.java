package leetcode;

/**
 * leetcode_204
 * 
 * Description:
 * 
 * Count the number of prime numbers less than a non-negative number, n.
 * 
 * @author rwxn
 *
 */
public class java_204 {
	public int countPrimes(int n) {
		int count = 0;
		if (n == 0 || n == 1) {
			return 0;
		}
		boolean[] a = new boolean[n];
		for (int i = 2; i * i < n; i++) {
			if (!a[i]) {
				count ++;
				for (int j = i; i * j < n; j++) {
					a[i * j] = true;
				}
			}
		}
		for (int i = 2; i < n; i++) {
			if (a[i] == false)
				count++;
		}
		return count;
	}
}
