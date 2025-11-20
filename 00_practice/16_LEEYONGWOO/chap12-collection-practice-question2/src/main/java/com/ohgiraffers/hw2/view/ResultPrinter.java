package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.ArrayList;

public class ResultPrinter {
    public void printAllList(ArrayList<BoardDTO> list){
        if(list.size()==0){
            noSearchResult();
        }else{
        for(BoardDTO b:list) {
            printBoard(b);
        }
        }
    }

    public void printBoard(BoardDTO b){
        b.setReadCount(b.getReadCount()+1);
        System.out.println(b.toString());
    }

    public void errorPage(String msg){
        if(msg.equals("insertBoard")){
            System.out.println("게시물 등록 실패");
        }else if(msg.equals("selectOne")){
            System.out.println("조회된 글이 없습니다.");
        }else if(msg.equals("updateTitle")){
            System.out.println("게시물 제목 수정 실패!");
        }else if(msg.equals("updateContent")){
            System.out.println("게시글 내용 수정 실패!");
        } else if (msg.equals("deleteBoard")) {
            System.out.println("게시글 삭제 실패");
        }else {
            System.out.println("error발생!");
        }
    }

    public void successPage(String msg){
        if(msg.equals("insertBoard")){
            System.out.println("게시물 등록 성공!");
        }else if(msg.equals("updateTitle")){
            System.out.println("게시물 제목 수정 성공!");
        }else if(msg.equals("updateContent")){
            System.out.println("게시글 내용 수정 성공!");
        } else if (msg.equals("deleteBoard")) {
            System.out.println("게시글 삭제 성공");
        }else {
            System.out.println("error발생!");
        }
    }

    public void noSearchResult(){
        System.out.println("검색 결과가 없습니다.");
    }
}
