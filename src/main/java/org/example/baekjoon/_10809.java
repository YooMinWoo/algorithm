package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] alphabetList = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();

        for(char c : alphabetList){
            sb.append(s.indexOf(c) + " ");
        }
        System.out.println(sb.toString().trim());
    }
}
