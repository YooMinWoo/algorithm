package org.example._2026._01._30;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PRO폰켓몬 {

    public int solution(int[] nums) {
        Set<Integer> integers = new HashSet<>();
        for (int num : nums) {
            integers.add(num);
        }
        int opp = nums.length/2;
        if(integers.size() >= opp) return opp;
        else return integers.size();
    }
}
