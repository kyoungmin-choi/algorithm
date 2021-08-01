package com.kakao.level2;

import java.util.Stack;

public class ParenthesisConversion3 {
    int position;

    public void main(String[] args){
        String p ="()";
        String answer = solution(p);
        System.out.println("?");
    }

    public String solution(String p) {
        if(p.isEmpty()){
            return p;
        }

        String answer = "(";
        boolean flag = isCorrect(p);
        String u = p.substring(0,position);
        String v = p.substring(position);

        if(flag){
            return u+solution(v);
        }

        answer += solution(v) + ")";

        for(int i=1; i<u.length()-1; i++){
            if(u.charAt(i) == '('){
                answer += ")";
            }else{
                answer += "(";
            }
        }


        return answer;
    }

    private boolean isCorrect(String str){
        boolean flag = true;
        int left = 0;
        int right = 0;

        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='('){
                left ++;
                st.push('(');
            }else{
                right ++;
                if(st.isEmpty()){
                    flag = false;
                }else{
                    st.pop();
                }
            }
            if(left==right){
                position = i+1;
                return flag;
            }
        }
        return flag;
    }
}