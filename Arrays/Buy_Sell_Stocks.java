// You are given an array prices where prices[i] is the price of a given stock on the ith day. u want to maximize ur profit by choosing a single dat to buy one stock and choosing a deffrent day in the future to sell that stock. Return the maximu profit u can achive from this transation. if u cannot achive any profit,return 0

public class Buy_Sell_Stocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(buyPrice<prices[i]){
                int profit = prices[i]-buyPrice;
                maxProfit = Math.max(maxProfit, buyPrice);
            }
            else{
                buyPrice = prices[i];
            }
            
        }
        System.out.println("Max profit : "+maxProfit);
        
    }
}


// profit = selling price - buy price
// we need to find the maximum profit
// we can do this by iterating through the array and finding the minimum buy price and the maximum selling
// price. The maximum profit will be the difference between the maximum selling price and the minimum buy price
// we can use a for loop to iterate through the array and keep track of the minimum buy price
// and the maximum selling price
 