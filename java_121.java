package leetcode;

/**
 * Say you have an array for which the ith element is the price of a given stock
 * on day i.
 * 
 * If you were only permitted to complete at most one transaction (ie, buy one
 * and sell one share of the stock), design an algorithm to find the maximum
 * profit.
 * 
 * Example 1: Input: [7, 1, 5, 3, 6, 4] Output: 5
 * 
 * max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger
 * than buying price) 
 * 
 * Example 2: Input: [7, 6, 4, 3, 1] Output: 0
 * 
 * In this case, no transaction is done, i.e. max profit = 0.
 * 
 * @author rwxn
 *
 */
public class java_121 {
	public int maxProfit(int[] prices) {
		int len = prices.length;
		if (len <= 1) {
			return 0;
		}
		int Max_Profit = 0;
		int Min_prices = prices[0];

		// for(int i = 0;i<len;i++){
		// for(int j = i+1;j <len;j++){
		// if((prices[j] > prices[i])&&(Max_Profit < (prices[j] - prices[i])))
		// Max_Profit = prices[j] - prices[i];
		// }
		// }

		for (int i = 0; i < len; i++) {
			if ((prices[i] - Min_prices) > Max_Profit) {
				Max_Profit = prices[i] - Min_prices;
			}
			if (prices[i] < Min_prices) {
				Min_prices = prices[i];
			}
		}
		return Max_Profit;
	}
}
