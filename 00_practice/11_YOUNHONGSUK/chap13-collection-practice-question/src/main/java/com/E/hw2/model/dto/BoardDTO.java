package com.E.hw2.model.dto;

import java.util.Date;

public class BoardDTO {

    private int BoardNo;
    private String boardTitle;
    private String boardWriter;
    private Date boardDate;
    private String boardContent;
    private int readCount;

    public BoardDTO() {
    }

    public BoardDTO(int boardNo, String BoardTitle, String boardWriter, Date boardDate, String boardContent, int readCount) {
        BoardNo = boardNo;
        this.boardTitle = BoardTitle;
        this.boardWriter = boardWriter;
        this.boardDate = boardDate;
        this.boardContent = boardContent;
        this.readCount = readCount;
    }

    public int getBoardNo() {
        return BoardNo;
    }

    public void setBoardNo(int boardNo) {
        BoardNo = boardNo;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardWriter() {
        return boardWriter;
    }

    public void setBoardWriter(String boardWriter) {
        this.boardWriter = boardWriter;
    }

    public Date getBoardDate() {
        return boardDate;
    }

    public void setBoardDate(Date boardDate) {
        this.boardDate = boardDate;
    }

    public String getBoardContent() {
        return boardContent;
    }

    public void setBoardContent(String boardContent) {
        this.boardContent = boardContent;
    }

    public int getReadCount() {
        return readCount;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }

    @Override
    public String toString() {
        return "BoardNo{" +
                "BoardNo=" + BoardNo +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardWriter='" + boardWriter + '\'' +
                ", boardDate=" + boardDate +
                ", boardContent='" + boardContent + '\'' +
                ", readCount=" + readCount +
                '}';
    }
}
