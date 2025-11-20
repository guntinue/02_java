package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.ArrayList;

public class ResultPrinter {

    //메소드
    public void printAllList(ArrayList<BoardDTO> list){
        for (BoardDTO board : list){
            System.out.println(board.toString());
        }
    }

    public void printBoard(BoardDTO b){

    }

    public void errorPage(String msg) {

    }

    public void successPage(String msg) {

    }

    public void noSearchResult() {

    }
}
