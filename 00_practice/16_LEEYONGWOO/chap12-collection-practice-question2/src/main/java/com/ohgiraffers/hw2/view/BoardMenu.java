package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.controller.BoardManager;
import com.ohgiraffers.hw2.model.comparator.*;
import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Comparator;
import java.util.Scanner;

public class BoardMenu {

        Scanner sc=new Scanner(System.in);
        private BoardManager bm=new BoardManager();
        private InputBoard ib=new InputBoard();



        public void mainMenu(){
            System.out.println("*** 게시글 서비스 프로그램 ***");


            do{
                System.out.println("""
                    1. 게시글 쓰기 
                    2. 게시글 전체보기
                    3. 게시글 한 개 보기
                    4. 게시글 제목 수정
                    5. 게시글 내용 수정
                    6. 게시글 삭제
                    7. 게시글 제목  검색
                    8. 정렬하기
                    9. 끝내기
                    """);
                System.out.print("메뉴 번호 선택: ");
                int a=sc.nextInt();
                switch (a) {
                    case 1:
                        bm.insertBoard(new InputBoard());
                        break;
                    case 2:
                        bm.selectAllList();
                        break;
                    case 3:
                        bm.selectOneBoard(ib.InputBoardNo());
                        break;
                    case 4:
                        bm.updateBoardTitle(ib.InputBoardNo(),ib.InputBoardTitle());
                        break;
                    case 5:
                        bm.updateBoardContent(ib.InputBoardNo(),ib.InputBoardContent());
                        break;
                    case 6:
                        bm.deleteBoard(ib.InputBoardNo());
                        break;
                    case 7:
                        bm.searchBoard(ib.InputBoardTitle());
                        break;
                    case 8:
                        sortSubMenu();
                        break;
                    case 9:
                        System.out.println("프로그램이 종료되었습니다.");
                        break;

                }
                System.out.println();
                if(a==9)break;

            }while (true);
        }

        public void sortSubMenu(){
            System.out.print("""
                    ***** 게시글 정렬 메뉴 *****
                    1. 글번호순 오름차순 정렬 
                    2. 글번호순 내림차순 정렬 
                    3. 작성날짜순 오름차순 정렬
                    4. 작성날짜순 내림차순 정렬
                    5. 글제목순 오름차순 정렬 
                    6. 글제목순 내림차순 정렬 
                    7. mainMenu()메소드로 이동
                    """);
            int b=sc.nextInt();
            switch (b){
                case 1:
                    bm.sortList((Comparator<BoardDTO>) new AscBoardNo());
                    break;
                case 2:
                    bm.sortList((Comparator<BoardDTO>)new DescBoardNo());
                    break;
                case 3:
                    bm.sortList((Comparator<BoardDTO>)new AscBoardDate());
                    break;
                case 4:
                    bm.sortList((Comparator<BoardDTO>)new DescBoardDate());
                    break;
                case 5:
                    bm.sortList((Comparator<BoardDTO>)new AscBoardTitle());
                    break;
                case 6:
                    bm.sortList((Comparator<BoardDTO>)new DescBoardTitle());
                    break;
                case 7:
                    System.out.println("메인메뉴로 이동");
                    mainMenu();
                    break;
            }

        }


}
