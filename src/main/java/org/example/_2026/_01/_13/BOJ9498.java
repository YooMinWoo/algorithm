package org.example._2026._01._13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 시험 성적
 *
 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 */
public class BOJ9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());

        if(score >= 90 && score <= 100) System.out.println("A");
        else if (score >= 80 && score <= 89) System.out.println("B");
        else if (score >= 70 && score <= 79) System.out.println("C");
        else if (score >= 60 && score <= 69) System.out.println("D");
        else System.out.println("F");
    }
}
