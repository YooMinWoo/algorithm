package org.example._2026._01._27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        String s1 = s.replaceAll("c=", "*");
        String s2 = s1.replaceAll("c-", "*");
        String s3 = s2.replaceAll("dz=", "*");
        String s4 = s3.replaceAll("d-", "*");
        String s5 = s4.replaceAll("lj", "*");
        String s6 = s5.replaceAll("nj", "*");
        String s7 = s6.replaceAll("s=", "*");
        String s8 = s7.replaceAll("z=", "*");
        System.out.println(s8.length());
    }
}
