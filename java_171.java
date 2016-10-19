package leetcode;

public class java_171 {
	/**
	 * 26进制->十进制
	 * Given a column title as appear in an Excel sheet, return its
	 * corresponding column number. 
	 * For example: A -> 1 B -> 2 C -> 3 ... Z ->26 AA -> 27 AB -> 28
	 * 
	 * @author rwxn
	 */
	public int titleToNumber(String s) {
		int Mid_count = 0;
		int Title_Number = 0;
		int len = s.length();
		s = s.toUpperCase();

		// if(len == 0){
		// return 0;
		// }

		for (int index = len - 1; index >= 0; index--) {
			int unit = 1;
			for (int i = len - index - 1; i > 0; i--) {
				unit *= 26;
			}
			if (index == len - 1) {
				Mid_count = (int) s.charAt(index) - 64;
			} else {
				Mid_count = ((int) s.charAt(index) - 64) * unit;
			}
			Title_Number += Mid_count;
		}

		return Title_Number;
	}
}
