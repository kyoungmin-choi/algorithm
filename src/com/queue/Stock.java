package com.queue;

import java.util.Stack;

public class Stock {

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 1, 2, 3, 3, 1, 2};
        int[] solution = new int[prices.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = prices.length - 1; i >= 0; i--) {
            stack.push(prices[i]);
        }


//        for (int a = 0; a < prices.length; a++) {
//            int top = stack.pop();
//            for (int b = stack.size()-1; b >= 0 ; b--) {
//                if (top <= stack.get(b)) {
//                    solution[a] = a;
//                }
//            }
//        }

        for (int i = 0; i <prices.length; i++) {
            // 상단 값
            int top = stack.pop();
            for (int j=stack.size()-1;j>=0;j--){
                if(top<=stack.get(j)){
                    if(j==0){
                        solution[i]=i-j;
                    }
                } else {
                    solution[i]=i-j;
                }
            }
        }
        solution[prices.length-1]=0;

        System.out.println("결과는");
    }
}
