package com.E.hw2.view;

import com.E.hw2.controller.BoardManager;

import java.util.Scanner;

public class BoardMenu {

    private BoardManager bm = new BoardManager();
    private InputBoard ib =  new InputBoard();
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        boolean on = true;
bm.set();
        while(on){
            System.out.println("""
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
                    메뉴 번호 선택 : >> 입력 받음
                   """);
            int input = sc.nextInt();
            switch(input){
                case 1:bm.insertBoard(ib.InputBoard());
                break;
                case 2:bm.selectAllList();
                break;
                case 3:bm.selectOneBoard(ib.InputBoardNo());
                break;
                case 4:bm.updateBoardTitle(ib.InputBoardNo(),ib.InputBoardTitle());
                    break;
                case 5:bm.updateBoardContent(ib.InputBoardNo(),ib.InputBoardContent());
                    break;
                case 6:bm.deleteBoard(ib.InputBoardNo());
                    break;
                case 7:bm.searchBoard(ib.InputBoardNo());
                    break;
                case 8:sortSubMenu();
                    break;
                case 9:on = false;
                break;
            }
        }
    }

    public void sortSubMenu(){

    }

}
