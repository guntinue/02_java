package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {
    /*
    private ArrayList<BookDTO> bookList;
    public BookManager(){
    // bookList 인스턴스 생성
    */
    private ArrayList<BookDTO> bookList; //왜 private로 생성하는지

    public BookManager(){

        bookList = new ArrayList<BookDTO>();

    }

    public void addBook(BookDTO book){

        bookList.add(book);

    }

    public void deleteBook(int index){

        bookList.remove(index);

    }

    public int searchBook(String bTitle){

        int result = -1;  // 왜 result를 -1로 선언 하였는지

        for(int i = 0 ; i < bookList.size(); i++) {

            if(bookList.get(i).getTitle().equals(bTitle)) {
                result = i;
                break;
            }

        }

        return result;

    }

    public void printBook(int index){

        if(index == -1) {

            System.out.println("조회하신 도서가 존재하지 않습니다.");

        } else {

            System.out.println(bookList.get(index));

        }

    }

    public void displayAll(){

        if(bookList.isEmpty()){

            System.out.println("출력할 도서가 없습니다.");

        } else {

            for(int i = 0 ; i < bookList.size(); i++) {
                System.out.println(bookList.get(i));
            }

        }

    }

    public ArrayList<BookDTO> sortedBookList(int select){


        if(select == 1) {
            bookList.sort(new AscCategory());
        } else  {
            bookList.sort(new DescCategory());
        }

        return bookList;
    }

    public void printBookList(ArrayList<BookDTO> br){

        for(BookDTO book : br) {
            System.out.println(book);
        }

    }
}

