package com.E.hw2.view;

import com.E.hw2.model.dto.BoardDTO;

import java.util.Date;
import java.util.Scanner;

public class InputBoard {

    Scanner sc = new Scanner(System.in);

    public BoardDTO InputBoard(){
        System.out.println(" Input BoardNo");
        int boardNo = Integer.valueOf(sc.nextLine());
        System.out.println(" Input BoardTitle");
        String title = sc.nextLine();
        System.out.println(" Input BoardWriter");
        String boardWriter = sc.nextLine();
        System.out.println(" Input BoardContent");
        String boardContent = "";
        StringBuilder sb = new StringBuilder();
        boolean enter = true;
        while(enter){
            boardContent = sc.nextLine();
            if(!boardContent.equals("exit")){
                sb.append(boardContent).append("\n");
            } else enter = false;
        }
        System.out.println(" Input readCount");
        int readCount = sc.nextInt();
        Date d = new  Date();

        BoardDTO b = new BoardDTO(boardNo,title, boardWriter,d, sb.toString(),readCount);
        return b;
    }

    public int InputBoardNo(){
        System.out.println(" Input BoardNo");
        int boardNo = sc.nextInt();
        sc.nextLine();
        return boardNo;
    }

    public String InputBoardTitle(){
        System.out.println(" Input BoardTitle");
        return sc.nextLine();
    }

    public String InputBoardContent(){
        System.out.println(" Input BoardContent");
        String boardContent = "";
        StringBuilder sb = new StringBuilder();
        boolean enter = true;
        while(enter){
            boardContent = sc.nextLine();
            if(!boardContent.equals("exit")){
                sb.append(boardContent).append("\n");
            } else enter = false;
        }
        return sb.toString();
    }

}
