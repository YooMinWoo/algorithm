package org.example._2026._01._30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BOJ14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        List<Integer> numbers = new ArrayList<>(List.of(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2])));
        numbers.sort(Comparator.naturalOrder());

        int a = numbers.get(0);
        int b = numbers.get(1);
        int c = numbers.get(2);

        if(c < (a+b)) System.out.println(a+b+c);
        else {
            System.out.println((a+b) + (a+b-1));
        }
    }
}
