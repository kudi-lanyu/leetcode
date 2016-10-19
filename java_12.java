package leetcode;

/**
 * Given an integer, convert it to a roman numeral.
 * 
 * Input is guaranteed to be within the range from 1 to 3999.
 * 
 * solution:from wiki .
 * 
 * The numbers 1 to 10 are usually expressed in Roman numerals as follows:
 * 
 * I, II, III, IV, V, VI, VII, VIII, IX, X.
 * 
 * 
 * 各进制位上单位各不相同，采用追加方式
 * 
 * 1~9: {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
 * 
 * 10~90: {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
 * 
 * 100~900: {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
 * 
 * 1000~3000: {"M", "MM", "MMM"}.
 * 
 * @author rwxn
 *
 */
public class java_12 {
	public String intToRoman(int num) {

		String result = "";
		String[][] Roman_char = { 
				{ "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" },
				{ "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" },
				{ "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" }, 
				{ "", "M", "MM", "MMM" }, 
		};

		int i = 0;
		while (num != 0) {
			int times = num % 10;
			result = Roman_char[i][times] + result;
			i++;
			num = num / 10;
		}

		return result;
	}

}
