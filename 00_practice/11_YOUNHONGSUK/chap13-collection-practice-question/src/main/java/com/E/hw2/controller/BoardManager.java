package com.E.hw2.controller;

import com.E.hw2.model.dto.BoardDTO;
import com.E.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;

public class BoardManager {

    ArrayList<BoardDTO> boardList = new ArrayList<>();
    ResultPrinter rp;

    public void set(){
        boardList.add(new BoardDTO(1, "title", "writer 1", new Date(), "short \n content \n", 80));
        boardList.add(new BoardDTO(2, "title2", "writer 2", new Date(), "short \n content \n", 90));
        boardList.add(new BoardDTO(3, "title3", "writer 3", new Date(), "short \n contet \n", 50));
    }

    public void insertBoard(BoardDTO b){
        boardList.add(b);
    }

    public void selectAllList(){
        for (BoardDTO b:boardList){
            System.out.println(b.toString());
        }
    }

    public void selectOneBoard(int BoardNo){
        for (BoardDTO b:boardList){
            if(b.getBoardNo()==BoardNo){
                System.out.println(b.toString());
            }
        }
    }

    public void updateBoardTitle(int BoardNo, String title){
    for (BoardDTO b:boardList){
        if(b.getBoardNo()==BoardNo){
            b.setBoardTitle(title);
        }
    }
    }

    public void updateBoardContent(int BoardNo, String content){
        for (BoardDTO b:boardList){
            if(b.getBoardNo()==BoardNo){
                b.setBoardContent(content);
            }
        }
    }

    public void deleteBoard(int BoardNo){
        Iterator<BoardDTO> it = boardList.iterator();
        while (it.hasNext()){
            BoardDTO b = it.next();
            if(b.getBoardNo()==BoardNo){
                it.remove();
            }
        }
    }

    public void searchBoard(int BoardNo){
        for (BoardDTO b:boardList){
            if(b.getBoardNo()==BoardNo){
                System.out.println(b.getBoardTitle());
            }
        }
    }

    public void sortList(Comparator<BoardDTO> c){
        boardList.sort(c);
        System.out.println(boardList);
        }
    }
}
