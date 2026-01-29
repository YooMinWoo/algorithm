package org.example._2026._01._30;

import java.util.Arrays;

public class PRO전화번호_목록 {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for(int i=0; i<phone_book.length - 1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])) return false;
        }
        return true;
    }
}
