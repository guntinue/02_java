package com.chaewookim.hw2.controller;

import com.chaewookim.hw2.model.dto.BoardDTO;
import com.chaewookim.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BoardManager {

    private ArrayList<BoardDTO> boardList = new ArrayList<>();
    ResultPrinter rp;

    public void insertBoard(BoardDTO b) {

        boardList.add(b);
    }

    public void selectAllList() {

        for (BoardDTO b : boardList) {
            System.out.println(b.toString());
        }
    }

    public void selectOneBoard(int boardNo) {

        for (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                System.out.println(b.toString());
                break;
            }
        }
    }

    public void updateBoardTitle(int boardNo, String title) {

        for (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                b.setBoardTitle(title);
            }
        }
    }

    public void updateBoardContent(int boardNo, String content) {

        for (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                b.setBoardContent(content);
            }
        }
    }

    public void deleteBoard(int boardNo) {

        for (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                boardList.remove(b);
            }
        }
    }

    public void searchBoard(String title) {

        for (BoardDTO b : boardList) {
            if (b.getBoardTitle().equals(title)) {
                System.out.println(b);
            }
        }
    }

    public void sortList(Comparator<BoardDTO> c) {

        boardList.sort(c);
        boardList.stream().forEach(System.out::println);
    }
}
