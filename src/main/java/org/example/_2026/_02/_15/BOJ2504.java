package org.example._2026._02._15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Stack<Character> stack = new Stack<>();
        int temp = 1;
        int result = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                temp = temp * 2;
                stack.push(s.charAt(i));
            } else if(s.charAt(i) == '['){
                temp = temp * 3;
                stack.push(s.charAt(i));
            } else if(s.charAt(i) == ')'){
                if(stack.isEmpty() || !stack.peek().equals('(')){
                    result = 0;
                    break;
                } else if(s.charAt(i-1) == '('){
                    result += temp;
                }
                temp /= 2;
                stack.pop();
            } else if(s.charAt(i) == ']'){
                if(stack.isEmpty() || !stack.peek().equals('[')){
                    result = 0;
                    break;
                } else if(s.charAt(i-1) == '['){
                    result += temp;
                }
                temp /= 3;
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            System.out.println(0);
            return;
        }
        System.out.println(result);
    }
}
