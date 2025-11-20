package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class BoardManager {
    //필드
    private ArrayList<BoardDTO> boardList;
    private ResultPrinter rp = new ResultPrinter();

    Scanner sc = new Scanner(System.in);


    //메소드
    public void insertBoard(BoardDTO b) {
        if (boardList == null) {
            boardList = new ArrayList<>();
        }
        boardList.add(b);
    }

    public void selectAllList() {
        if (boardList == null) {
            System.out.println("게시물이 없습니다.");
            return;
        }
        for  (BoardDTO b : boardList) {
            b.setReadCount(b.getReadCount()+1);//조회
        }
        rp.printAllList(boardList);
    }

    public void selectOneBoard(int boardNo){
        for (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                System.out.println(b.toString());
                b.setReadCount(b.getReadCount()+1);
            }
        }
        System.out.println("찾는 게시물이 없습니다.");
    }

    public void updateBoardTitle(int boardNo, String title){
        for (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                b.setBoardTitle(title);
                System.out.println("게시글의 제목이 수정되었습니다.");
            }
        }
    }

    public void updateBoardContent(int boardNo, String content){
        for(BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                b.setBoardContent(content);
                System.out.println("내용 수정이 완료되었습니다.");
            }
        }
    }

    public void deleteBoard(int boardNo){
        for (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                boardList.remove(b);
                System.out.println("게시물이 삭제되었습니다.");
            }
        }
    }

    public void searchBoard(String title){
        ArrayList<BoardDTO> searchedList = new ArrayList<>();
        for (BoardDTO b : boardList) {
            if (b.getBoardTitle().contains(title)) {
                searchedList.add(b);
            }
        }
        for (BoardDTO searchedBoard : searchedList) {
            System.out.println(searchedBoard.toString());
            searchedBoard.setReadCount(searchedBoard.getReadCount()+1);
        }
    }

    public void sortList(Comparator<BoardDTO> c){
        boardList.sort(c);
        System.out.println(boardList.toString());
        System.out.println();
    }
}
