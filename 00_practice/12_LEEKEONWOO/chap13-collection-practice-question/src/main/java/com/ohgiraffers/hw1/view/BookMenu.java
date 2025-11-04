package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.awt.*;
import java.util.Scanner;

public class BookMenu {

    private Scanner sc;

    private BookManager bm;

    public BookMenu() {
        Scanner sc = new Scanner(System.in);

        boolean cb = true;

        while (cb) {

            System.out.print("""
                    *** 도서 관리 프로그램 ***
                    1. 새 도서 추가
                    2. 도서정보 정렬 후 출력
                    3. 도서 삭제
                    4. 도서 검색출력
                    5. 전체 출력
                    6. 끝내기
                    메뉴 번호 선택 :\s"""
            );
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    bm.addBook(inputBook());
                    System.out.println("도서 추가 완료.");
                    break;

                case 2:
                    sc = new Scanner(System.in);
                    System.out.print("정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순) : ");
                    int printSelect = sc.nextInt();
                    if (printSelect == 1 || printSelect == 2) {
                        bm.printBookList(bm.sortedBookList(printSelect));
                    } else {
                        System.out.println("번호를 잘못 입력 하셨습니다.");
                    }
                    break;

                case 3:
                    System.out.print("삭제하실 책의 인덱스를 입력하세요 : ");
                    int index = sc.nextInt();
                    bm.deleteBook(index);
                    break;

                case 4:
                    bm.printBook(bm.searchBook(inputBookTitle()));
                    break;

                case 5:
                    bm.displayAll();
                    break;

                case 6:
                    System.out.print("정말 종료 하시겠습니까? (Y/N) : ");
                    char end = sc.next().charAt(0);
                    if (end == 'Y' || end == 'y') {
                        System.out.println("프로그램을 종료합니다.");
                        cb = false;
                        break;
                    } else if (end == 'N' || end == 'n') {
                    System.out.println("============ 메인 메뉴로 돌아갑니다 ===========");
                    break;
                }
                default:
                    System.out.println("잘못 입력 하셨습니다.");
                    continue;
            }
        }
    }


    public void menu() {

    }

    public BookDTO inputBook() {
        System.out.println("도서 등록 프로그램 실행.");
//        sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.print("도서 번호 : ");
        int bNo = sc.nextInt();

        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int category = sc.nextInt();

        System.out.print("도서 제목 : ");
        String bTitle = sc.nextLine();

        System.out.print("도서 저자 : ");
        String author = sc.nextLine();

        return new BookDTO(bNo, category, bTitle, author);
    }

    public String inputBookTitle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("도서 제목 : ");
        String title = sc.nextLine();

        return title;
    }
}

