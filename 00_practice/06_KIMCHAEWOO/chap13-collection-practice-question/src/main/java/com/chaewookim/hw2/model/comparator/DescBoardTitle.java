package com.chaewookim.hw2.model.comparator;

import com.chaewookim.hw2.model.dto.BoardDTO;

import java.util.Comparator;

public class DescBoardTitle implements Comparator<BoardDTO> {
    @Override
    public int compare(BoardDTO o1, BoardDTO o2) {

        int result = o1.getBoardTitle().compareTo(o2.getBoardTitle());

        switch (result) {
            case 1:
                return -1;
            case 0:
                return 0;
            case -1:
                return 1;
            default:
                return 1;
        }
    }
}
