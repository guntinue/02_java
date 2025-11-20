package com.chaewookim.hw2.view;

import com.chaewookim.hw2.controller.BoardManager;
import com.chaewookim.hw2.model.comparator.*;

import java.util.Scanner;

public class BoardMenu {

    private BoardManager bm = new BoardManager();
    InputBoard ib;

    public void mainMenu() {

        Scanner sc = new Scanner(System.in);
        InputBoard ib = new InputBoard();
        int input = 0;
        String menu = """
                *** 게시글 서비스 프로그램 ***
                1. 게시글 쓰기
                2. 게시글 전체보기 
                3. 게시글 한 개보기
                4. 게시글 제목 수정
                5. 게시글 내용 수정
                6. 게시글 삭제
                 7. 게시글 제목 검색
                 8, 정렬하기
                 9. 끝내기
                """;

        while (input != 9) {
            System.out.println(menu);
            System.out.print("메뉴 번호 선택: ");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    bm.insertBoard(ib.inputBoard());
                    break;
                case 2:
                    bm.selectAllList(); break;
                case 3:
                    bm.selectOneBoard(ib.inputBoardNo()); break;
                case 4:
                    bm.updateBoardTitle(ib.inputBoardNo(), ib.inputBoardTitle()); break;
                case 5:
                    bm.updateBoardContent(ib.inputBoardNo(), ib.inputBoardContent()); break;
                case 6:
                    bm.deleteBoard(ib.inputBoardNo()); break;
                case 7:
                    bm.searchBoard(ib.inputBoardTitle()); break;
                case 8:
                    sortSubMenu(); break;
                case 9:
                    System.out.println("프로그램 종료");
                    break;
            }
        }

    }

    public void sortSubMenu() {

        Scanner sc = new Scanner(System.in);
        int input = 0;
        String menu = """
                ***** 게시글 정렬 메뉴 *****
                1. 글번호순 오름차순 정렬 // sortList(AscBoardNo())
                2. 글번호순 내림차순 정렬 // sortList(DescBoardNo())
                3. 작성날짜순 오름차순 정렬 // sortList(AscBoardDate())
                4. 작성날짜순 내림차순 정렬// sortList(DescBoardDate())
                5. 글제목순 오름차순 정렬 // sortList(AscBoardTitle())
                6. 글제목순 내림차순 정렬 // sortList(DescBoardTitle())
                7. mainMenu()메소드로 이동
                """;
        System.out.println(menu);
        System.out.print("메뉴 번호 선택: ");
        input = sc.nextInt();
        sc.nextLine();

        switch (input) {
            case 1:
                bm.sortList(new AscBoardNo()); break;
            case 2:
                bm.sortList(new DescBoardNo()); break;
            case 3:
                bm.sortList(new AscBoardDate()); break;
            case 4:
                bm.sortList(new DescBoardDate()); break;
            case 5:
                bm.sortList(new AscBoardTitle()); break;
            case 6:
                bm.sortList(new DescBoardTitle()); break;
            default:
                break;
        }
    }
}
