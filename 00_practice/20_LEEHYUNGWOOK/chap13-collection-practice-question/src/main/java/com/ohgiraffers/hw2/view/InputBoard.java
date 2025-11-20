package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Date;
import java.util.Scanner;

/*    //필드
    private int boardNo;
    private String boardTitle;
    private String boardWriter;
    private Date boardDate;
    private String boardContent;
    private int readCount;*/

public class InputBoard {
    Scanner sc = new Scanner(System.in);
    //crud 메소드
    public BoardDTO inputBoard() {
        System.out.println("----게시글 등록----");
        System.out.print("게시글 번호를 입력해주세요 : ");
        int board_num = sc.nextInt();
        sc.nextLine();
        System.out.print("글 제목을 작성해주세요 : ");
        String title = sc.nextLine();
        System.out.print("작성자를 입력하세요 : ");
        String writer = sc.nextLine();
        System.out.print("글 내용을 작성해주세요 : ");
        StringBuilder contents = new StringBuilder();
        String content_detail = sc.nextLine();
        while (!content_detail.equals("exit")) {
            contents.append(content_detail);
            content_detail = sc.nextLine();
        }
        String content = contents.toString();
        Date date = new Date();

        return new BoardDTO(board_num, title, writer, date, content, 0);
    }

    public int inputBoardNo() {
        Scanner sc2 = new Scanner(System.in);
        System.out.print("게시글 번호를 입력하세요 : ");
        int bNum =  sc2.nextInt();
        return bNum;
    }

    public String inputBoardTitle() {
        System.out.print("게시글 제목을 입력하세요.");
        String title = sc.nextLine();
        return title;
    }

    public String inputBoardContent() {
        System.out.print("글 내용을 작성해주세요(나가려면exit을쳐주세요) : ");
        StringBuilder contents = new StringBuilder();
        String content_detail = sc.nextLine();
        while (!content_detail.equals("exit")) {
            contents.append(content_detail);
            content_detail = sc.nextLine();
        }
        String content = contents.toString();
        return content;
    }

}
