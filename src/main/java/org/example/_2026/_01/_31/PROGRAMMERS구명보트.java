package org.example._2026._01._31;

import java.util.Arrays;

public class PROGRAMMERS구명보트 {
    public static void main(String[] args) {
        PROGRAMMERS구명보트 구명보트 = new PROGRAMMERS구명보트();
        구명보트.solution(new int[]{70, 50, 80, 50}, 100);
    }

    public int solution(int[] people, int limit) {
        int answer = 0;
        int idx = 0;
        Arrays.sort(people);

        for(int i=people.length-1; i>=idx; i--){
            if(people[i] + people[idx] <= limit){
                idx++;
                answer++;
            }else answer++;
        }
        System.out.println(answer);
        return answer;
    }

}
