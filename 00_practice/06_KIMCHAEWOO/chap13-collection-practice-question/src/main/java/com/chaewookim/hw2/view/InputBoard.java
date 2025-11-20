package com.chaewookim.hw2.view;

import com.chaewookim.hw2.model.dto.BoardDTO;

import java.util.Date;
import java.util.Scanner;

public class InputBoard {

    public BoardDTO inputBoard() {

        Scanner sc = new Scanner(System.in);

        int boardNo;
        String boardTitle;
        String boardWriter;
        Date boardDate = new Date();
        String boardContent;
        int readCount;

        System.out.print("no: ");
        boardNo = sc.nextInt();
        sc.nextLine();
        System.out.print("title: ");
        boardTitle = sc.nextLine();
        System.out.print("writer: ");
        boardWriter = sc.nextLine();
        System.out.print("content: ");
        boardContent = sc.nextLine();
        System.out.print("count: ");
        readCount = sc.nextInt();

        return new BoardDTO(boardNo, boardTitle, boardWriter, boardDate, boardContent, readCount);
    }

    public int inputBoardNo() {

        Scanner sc = new Scanner(System.in);

        System.out.print("no: ");
        int no = sc.nextInt();

        return no;
    }

    public String inputBoardTitle() {

        Scanner sc = new Scanner(System.in);

        System.out.print("no: ");
        String title = sc.nextLine();

        return title;
    }

    public String inputBoardContent() {

        Scanner sc = new Scanner(System.in);

        System.out.print("no: ");
        String content = sc.nextLine();

        return content;
    }
}
