package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.controller.BoardManager;

import java.util.Scanner;

public class BoardMenu {

    private BoardManager bm;
    private InputBoard ib;

    static void mainMenu() {
        String s = """
                *** 게시글 서비스 프로그램 ***
                1. 게시글 쓰기 // insertBoard(inputBoard()이 리턴한 객체) 실행
                2. 게시글 전체보기 // selectAllList() 실행
                3. 게시글 한 개보기 // selectOneBoard(inputBoardNo()) 실행
                4. 게시글 제목 수정 // updateBoardTitle(inputBoardNo(),inputBoardTitle()) 실행
                5. 게시글 내용 수정 // updateBoardContent(inputBoardNo(),inputBoardContent()) 실행
                6. 게시글 삭제 // deleteBoard(inputBoardNo()) 실행
                7. 게시글 제목 검색 // searchBoard(inputBoardTitle()) 실행
                8, 정렬하기 // sortSubMenu() 실행
                9. 끝내기 // “프로그램이 종료되었습니다.” 출력
                """;
        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 번호 선택 : ");
        int selectMenu = sc.nextInt();
        switch (selectMenu) {
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:

            case 6:

            case 7:

            case 8:

        }
// 메뉴 화면 반복 실행 처리
// 해당 메뉴 번호에 따라 BoardManager 클래스 메소드 실행

    }

    public void sortSubMenu() {

    }
}
