package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.InputBoard;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Comparator;

public class BoardManager {
    private ArrayList<BoardDTO> boardList;
    private ResultPrinter rp;

    public BoardManager() {
        this.boardList = new ArrayList<>();
        this.rp = new ResultPrinter();
    }

    public void insertBoard(InputBoard b) {
        boardList.add(b.InputBoard());
    }

    public void selectAllList() {
        rp.printAllList(boardList);
    }

    public void selectOneBoard(int boardNo) {
        BoardDTO b = boardList.get(boardNo);
        rp.printBoard(b);
    }

    public void updateBoardTitle(int boardNo, String title) {
        BoardDTO b = boardList.get(boardNo);
        b.setBoardTitle(title);
    }

    public void updateBoardContent(int boardNo, String content) {
        BoardDTO b = boardList.get(boardNo);
        b.setBoardContent(content);
    }

    public void deleteBoard(int boardNo) {
        boardList.remove(boardNo);
    }

    public void searchBoard(String title) {
        boolean found = false;
        for (BoardDTO b : boardList) {
            if (b.getBoardTitle().contains(title)) {
                rp.printBoard(b);
                found = true;
            }
        }
        if (!found) {
            rp.noSearchResult();
        }
    }

    public void sortList(Comparator<BoardDTO> c) {
        boardList.sort(c);
        rp.printAllList(boardList);
    }
}
