package org.example._2026._01._30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i=1; i<=N; i++){
            int sum = i;
            int temp = i;
            while(temp>0){
                sum += temp % 10;
                temp /= 10;
            }
//            char[] charArray = String.valueOf(i).toCharArray();
//            for (char c : charArray) {
//                sum += Integer.parseInt(String.valueOf(c));
//            }
            if(sum == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
