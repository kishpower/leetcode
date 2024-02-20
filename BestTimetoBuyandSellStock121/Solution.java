package BestTimetoBuyandSellStock121;

public class Solution {
    public static void main(String[] args) {
        System.out.println(        maxProfit(new int[]{7,1,5,3,6,4})
        );
    }
//    public static int maxProfit(int[] prices) {
//        int minPrice = 1000;
//        int profit = 0;
//        int profitIfISoldToday = 0;
//
//        for (int i=0;i< prices.length;i++){
//            if (prices[i]<minPrice){
//                minPrice= prices[i];
//            }
//            profitIfISoldToday = prices[i] - minPrice;
//
//            if (profitIfISoldToday > profit){
//                profit = profitIfISoldToday;
//            }
//        }
//        System.out.println("profit = " + profit);
//        return profit;
//    }

    public static int maxProfit(int[] prices){
        int minPrice = 1000;
        int maxProfit = 0;
        int maxProfitIfSoldToday = 0;

        for (int i = 0 ; i < prices.length ; i++){
            if (prices[i] < minPrice) minPrice = prices[i];

            maxProfitIfSoldToday = prices[i] - minPrice;

            if (maxProfitIfSoldToday > maxProfit) maxProfit = maxProfitIfSoldToday;
        }

        return maxProfit;
    }

}
