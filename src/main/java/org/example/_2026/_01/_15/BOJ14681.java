package org.example._2026._01._15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        // 1,4 사분면
        if(x>0){
            if(y>0) System.out.println(1);
            else if (y<0) System.out.println(4);
        }
        // 2,3 사분면
        else if (x<0) {
            if(y>0) System.out.println(2);
            else if (y<0) System.out.println(3);
        }
    }
}
