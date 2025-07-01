package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String abc = br.readLine().toUpperCase();
        int[] count = new int[26];

        for(char ch : abc.toCharArray()){
            count[ch - 'A']++;
        }

        int max = 0;
        char result = '?';

        for(int i=0; i<count.length; i++){
            if(count[i] > max) {
                max = count[i];
                result = (char) (i + 'A');
            } else if(count[i] == max){
                result = '?';
            }
        }

        System.out.println(result);
    }
}
