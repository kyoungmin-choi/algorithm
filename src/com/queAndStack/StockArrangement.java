package com.queAndStack;

public class StockArrangement {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 1, 2, 3, 3, 1, 2};
        int[] solution = new int[prices.length];

        for (int i = 0; i < prices.length - 1; i++) {
            int top = prices[i];

            int total = 0;
            for (int j = i + 1; j < prices.length; j++) {
                total += 1;
                if (top > prices[j]) {
                    break;
                }
            }
            solution[i] = total;
        }

        System.out.println("?");
    }
}
