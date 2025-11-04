package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {

    public int countAlpha(String s) throws CharCheckException{
//        1. 전달된 문자열값에서 영문자가 몇개인지 카운트해서 리턴
//        2. 단, 공백문자가 있으면, `CharCheckException` 발생
        int count = 0;

        if(!s.contains(" ")){
            count = s.length();
        } else {
            throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
        }

        return count;
    }
}
