package org.example._2026._02._09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] people = new int[N];
        String[] s = br.readLine().split(" ");
        for(int i=0; i<s.length; i++){
            people[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(people);

        int sum = 0;
        int result = 0;

        for (int person : people) {
            sum += person;
            result += sum;
        }
        System.out.println(result);
    }
}
