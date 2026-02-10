package org.example._2026._02._10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Integer[] a = new Integer[N];
        String[] s = br.readLine().split(" ");

        for(int i=0; i<N; i++){
            a[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(a);

        int M = Integer.parseInt(br.readLine());

        for (String X : br.readLine().split(" ")) {
            boolean TF = false;
            int i = Integer.parseInt(X);
            int left = 0;
            int right = N-1;
            while (left <= right){
                int mid = (left+right)/2;
                if(i == a[mid]) {
                    TF = true;
                    break;
                }
                else if(i < a[mid]) right = mid - 1;
                else if(i > a[mid]) left = mid + 1;
            }
            if(TF) System.out.println(1);
            else System.out.println(0);
        }

    }
}
