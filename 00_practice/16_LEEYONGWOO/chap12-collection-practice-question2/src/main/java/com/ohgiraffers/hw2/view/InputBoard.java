package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Date;
import java.util.Scanner;

public class InputBoard {
    Scanner sc=new Scanner(System.in);
    public BoardDTO InputBoard(){

        int count=InputBoardNo();
        String title=InputBoardTitle();

        System.out.print("작성자 : ");
        String writer=sc.next();

        String content=InputBoardContent();

        Date date=new Date();

        BoardDTO boardDTO=new BoardDTO(count,title,writer,date,content,0);




        return boardDTO;
    }

    public int InputBoardNo(){
        System.out.print("글 번호를 입력하세요 ");
        int no=sc.nextInt();
        return no;
    }

    public String InputBoardTitle(){
        System.out.print("제목을 입력하세요 : ");
        String title=sc.next();
        return title;
    }

    public String InputBoardContent() {
        System.out.println("내용을 입력하세요 (종료하려면 'exit' 입력) : ");
        StringBuilder content = new StringBuilder();
        String line;

        while (!(line = sc.nextLine()).equals("exit")) {
            if (content.length() > 0) {
                content.append("\n");
            }
            content.append(line);
        }

        return content.toString();
    }

}
