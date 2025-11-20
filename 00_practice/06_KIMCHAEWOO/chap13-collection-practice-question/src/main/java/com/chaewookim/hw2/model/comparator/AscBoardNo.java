package com.chaewookim.hw2.model.comparator;

import com.chaewookim.hw1.model.dto.BookDTO;
import com.chaewookim.hw2.model.dto.BoardDTO;

import java.util.Comparator;

public class AscBoardNo implements Comparator<BoardDTO> {

    @Override
    public int compare(BoardDTO o1, BoardDTO o2) {
        if (o1.getBoardNo() > o2.getBoardNo()) {
            return -1;
        } else if (o1.getBoardNo() == o2.getBoardNo()) {
            return 0;
        } else return 1;
    }
}
