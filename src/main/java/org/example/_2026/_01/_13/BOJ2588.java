package org.example._2026._01._13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 곱셈
 */
public class BOJ2588 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        int num2 = Integer.parseInt(new String(arr));

        System.out.println(num1 * (arr[2] - '0'));
        System.out.println(num1 * (arr[1] - '0'));
        System.out.println(num1 * (arr[0] - '0'));
        System.out.println(num1 * num2);
    }
}
