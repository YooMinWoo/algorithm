package org.example._2026._01._24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArray = br.readLine().toCharArray();
        int[] alp = new int[26];
        for(int i=0; i<alp.length; i++){
            alp[i] = -1;
        }
        for(int i=0; i< charArray.length; i++){
            int j = (int) charArray[i] - 'a';
            if(alp[j] == -1) alp[j] = i;
        }
        for(int i : alp){
            System.out.print(i+" ");
        }
    }
}
