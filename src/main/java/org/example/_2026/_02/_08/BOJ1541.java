package org.example._2026._02._08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] nums = s.split("[+-]");
        String[] pnm = new String[nums.length - 1];
        int result = Integer.parseInt(nums[0]);
        int pnmIdx = 0;
        for(int i=0; i<s.length(); i++){
            if(String.valueOf(s.charAt(i)).equals("+") || String.valueOf(s.charAt(i)).equals("-")){
                pnm[pnmIdx] = String.valueOf(s.charAt(i));
                pnmIdx++;
            }
        }
        boolean TF = false;
        for(int i=0; i<pnm.length; i++){
            if(TF) {
                pnm[i] = "-";
                continue;
            }
            if(pnm[i].equals("-")) TF=true;
        }
        for(int i=0; i< pnm.length; i++){
            int num = Integer.parseInt(nums[i+1]);
            if(pnm[i].equals("+")) result += num;
            else if(pnm[i].equals("-")) result -= num;
        }
        System.out.println(result);
    }
}

