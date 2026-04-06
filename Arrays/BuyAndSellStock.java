package Arrays;
public class BuyAndSellStock {

    // Function to calculate maximum profit
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE; // minimum price so far
        int profit = 0; // maximum profit

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i]; // update minimum price
            } else {
                int currentProfit = prices[i] - min; // profit if sold today
                if (currentProfit > profit) {
                    profit = currentProfit; // update max profit
                }
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }
}