package org.example._2026._01._27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int sum = 0;
        char[] charArray = s[0].toCharArray();
        int N = Integer.parseInt(s[1]);

        for(int i=0; i<charArray.length; i++){
            if(charArray[i] - 55 >= 10){
                sum += (charArray[i] - 55) * (Math.pow(N, charArray.length - i - 1));
                continue;
            }
            sum += Character.getNumericValue(charArray[i]) * (Math.pow(N, charArray.length - i - 1));
        }
        System.out.println(sum);
    }
}
