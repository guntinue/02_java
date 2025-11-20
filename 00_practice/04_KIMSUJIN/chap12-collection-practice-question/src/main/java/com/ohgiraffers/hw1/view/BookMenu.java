package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;
import com.ohgiraffers.hw1.run.Application;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();

    public BookMenu() {
    }

    public void menu(){
        /*도서 관리 프로그램 */

        outer : while (true){
            System.out.println("""
                1. 새 도서 추가
                2. 도서정보 정렬 후 출력
                3. 도서 삭제
                4. 도서 검색출력
                5. 전체 출력
                6. 끝내기
                """);

            System.out.print("번호 입력 : ");
            int num = sc.nextInt();
            switch (num){
                case 1: bm.addBook(inputBook()); break;
                case 2: System.out.print("정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순)");
                    int input = sc.nextInt();
                    if(input == 1){
                        ArrayList<BookDTO> alb = bm.sortedBookList(1);
                        bm.printBookList(alb);
                    }else if(input == 2){
                        ArrayList<BookDTO> alb = bm.sortedBookList(2);
                        bm.printBookList(alb);
                    }else {
                        System.out.println("번호를 잘못 입력하셨습니다.");
                    } break;
                case 3: System.out.print("삭제할 도서 번호 입력: ");
                    int number = sc.nextInt();
                    bm.deleteBook(number); break;
                case 4: System.out.print("찾고 싶은 도서 제목 입력");
                    String title = inputBookTitle();
                    int id = bm.searchBook(title);
                    if (id == -1){
                        System.out.println("조회한 도서가 존재하지 않음");
                    }else {
                        bm.printBook(id);
                    }break;
                case 5: bm.displayAll(); break;
                case 6:
                    System.out.println("프로그램 종료합니다."); break outer;
                default:
                    System.out.println("잘못된 숫자입니다.");
                    break;
            }
        }



    }

    public BookDTO inputBook(){
        System.out.print("도서 번호 입력 :");
        int bNo = sc.nextInt();

        System.out.print("도서 제목: ");
        String title = sc.next();

        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) :");
        int category =  sc.nextInt();

        System.out.print("도서 저자: ");
        String author = sc.next();

        BookDTO book = new BookDTO(bNo, category, title, author);

        return book;

    }

    public String inputBookTitle(){
        System.out.print("도서 제목: ");
        String title = sc.next();
        return title;
    }
}
