package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1213 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
//        int len = input.length();
//
//        char[] result = new char[len];
        char[] toArr = input.toCharArray();
        int[] result = new int[26];
//
        StringBuilder sb = new StringBuilder();
//
        Arrays.sort(toArr);

        for(int i=0; i<26; i++){
            for(char c : toArr){
                if(c == 'A'+i) result[i] += 1;
            }
        }
        int oddCount = 0;
        String front = "";
        String mid = "";
        String end = "";
        for(int i=0; i<26; i++){
            if(oddCount > 1) {
                break;
            }
            if(result[i] == 0) continue;
            if(result[i] % 2 == 1){
                oddCount++;
                mid = String.valueOf((char)('A'+i));
            }
            for(int j=0; j<result[i]/2; j++){
                sb.append(String.valueOf((char)('A'+i)));
            }
        }
        front = sb.toString();
        end = sb.reverse().toString();
        if(oddCount > 1){
            System.out.println("I'm Sorry Hansoo");
        } else if(oddCount == 0){
            System.out.println(front+end);
        } else if(oddCount == 1){
            System.out.println(front+mid+end);
        }
    }
}
