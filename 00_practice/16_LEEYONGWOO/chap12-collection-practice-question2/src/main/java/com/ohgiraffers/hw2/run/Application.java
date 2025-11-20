package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.controller.BoardManager;
import com.ohgiraffers.hw2.view.BoardMenu;
import com.ohgiraffers.hw2.view.InputBoard;

import java.util.Scanner;


public class Application {
    public static void main(String[] args) {
        BoardMenu bm=new BoardMenu();
        bm.mainMenu();
    }

    public void sortSubMenu(){
        System.out.println("***** 게시글 정렬 메뉴 *****");
        System.out.println("""
                1. 글번호순 오름차순 정렬
                2. 글번호순 내림차순 정렬
                3. 작성날짜순 오름차순 정렬
                4. 작성날짜순 내림차순 정렬
                5. 글제목순 오름차순 정렬
                6. 글제목순 내림차순 정렬
                7. mainMenu()메소드로 이동
                """);


    }
}
