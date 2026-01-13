package org.example._2026._01._13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 사칙연산
 * 문제 : 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
 */
public class BOJ10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        System.out.println(Integer.parseInt(str[0]) + Integer.parseInt(str[1]));
        System.out.println(Integer.parseInt(str[0]) - Integer.parseInt(str[1]));
        System.out.println(Integer.parseInt(str[0]) * Integer.parseInt(str[1]));
        System.out.println(Integer.parseInt(str[0]) / Integer.parseInt(str[1]));
        System.out.println(Integer.parseInt(str[0]) % Integer.parseInt(str[1]));
    }
}
