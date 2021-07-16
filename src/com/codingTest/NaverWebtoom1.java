package com.codingTest;

import java.util.Arrays;
import java.util.Collections;

public class NaverWebtoom1 {
    public static void main(String[] args) {
        int[] originPrices = {32000, 18000, 42500};
        int[] originDiscounts = {50, 20, 65};
        Integer prices[] = Arrays.stream(originPrices).boxed().toArray(Integer[]::new);
        Integer discounts[] = Arrays.stream(originDiscounts).boxed().toArray(Integer[]::new);

        Arrays.sort(prices, Collections.reverseOrder());
        Arrays.sort(discounts, Collections.reverseOrder());

        int total = 0;
        for (int i = 0; i < prices.length; i++) {
            if (discounts.length <= i) {
                int a = prices[i];
                total += prices[i];
            } else {
                int b = prices[i];
                double c = (100 - discounts[i]) * 0.01;
                total += prices[i] * ((100 - discounts[i]) * 0.01);
            }
        }

    }
}
