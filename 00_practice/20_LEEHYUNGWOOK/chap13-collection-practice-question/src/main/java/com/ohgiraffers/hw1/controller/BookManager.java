package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {
    private ArrayList<BookDTO> bookList;

    public BookManager() {
        bookList = new ArrayList<>();
    }

    public void addBook(BookDTO book) {
        bookList.add(book);
    }

    public void deleteBook(int index) {
        if (bookList.size() > (index-1)) {
            bookList.remove(index-1);
        } else {
            System.out.println("삭제할 도서를 찾지 못했습니다.");
        }
    }

    public int searchBook(String bTitle) {
        int index = 0;
        for (BookDTO book : bookList) {
            if (book.getTitle().equals(bTitle)) {
                return book.getbNo();
            }
        }
        return index;
    }

    public void printBook(int index) {
        for  (BookDTO book : bookList) {
            if ( book.getbNo() == index ) {
                System.out.println(book.toString());
                return;
            }
        }
        System.out.println("조회한 도서가 존재하지 않음.");
    }

    public void displayAll() {
        if (bookList.isEmpty()) {
            System.out.println("출력할 도서가 없습니다.");
            return;
        }
        for (int i = 0; i<bookList.size(); i++) {
            System.out.println((i+1) + "번 : " + bookList.get(i).toString());
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select) {

        if (select==1) {//오름
           bookList.sort(new AscCategory());
        } else if (select==2) {//내림
            bookList.sort(new DescCategory());
        }
        return bookList;
    }

    public void printBookList(ArrayList<BookDTO> br) {
        for (BookDTO book : br) {
            System.out.println(book.toString());
                    }
    }
}
