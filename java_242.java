package leetcode;

import java.util.Arrays;

public class java_242 {
	public boolean isAnagram(String s, String t) {
		char[] s_to_Array = s.toCharArray();
		char[] t_to_Array = t.toCharArray();

		Arrays.sort(s_to_Array);
		Arrays.sort(t_to_Array);

		return String.valueOf(s_to_Array).equals(String.valueOf(t_to_Array));

	}
}
