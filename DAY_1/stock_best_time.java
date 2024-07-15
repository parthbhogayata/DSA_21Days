// Given an array prices[] of length N, representing the prices of the stocks on different days, the task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed.

// Input: prices[] = {7, 1, 5, 3, 6, 4}
// Output: 5

// Explanation:
// The lowest price of the stock is on the 2nd day, i.e. price = 1. Starting from the 2nd day, the highest price of the stock is witnessed on the 5th day, i.e. price = 6. 
// Therefore, maximum possible profit = 6 – 1 = 5. 

class stock_best_time{

    static int app_1(int[] prices){
        int buy = prices[0] , max_profit = 0;

        for(int i=1;i<prices.length;i++){
            if(buy > prices[i])
                buy = prices[i];
            else if(prices[i] - buy > max_profit){
                max_profit = prices[i] - buy;
            }
        }
        return max_profit;
    }

    public static void main(String[] args){
       int prices[] = {7, 1, 5, 3, 6, 4};
       int ans = app_1(prices);

       System.out.println("Maximum Profit is :- "+ans[1]+);
    }
}