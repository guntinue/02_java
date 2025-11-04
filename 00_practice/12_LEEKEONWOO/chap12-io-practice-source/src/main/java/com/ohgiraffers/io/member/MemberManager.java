package com.ohgiraffers.io.member;

import java.io.*;

public class MemberManager {


    public void readMembers(){
        ObjectInputStream objIn = null;

        try {
            objIn = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream(
                                    "src/main/java/com/ohgiraffers/io/member/members.ser")));
            while (true) {
                System.out.println(objIn.readObject());
            }
        } catch(EOFException e){
            System.out.println("파일 읽기 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (objIn != null) {
                try {
                    objIn.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }



    public void addMember(Member member) {

        Member[] members = new Member[]{member};
        ObjectOutputStream objOut = null;

        try {
            objOut = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("src/main/java/com/ohgiraffers/io/member/members.ser")));

            for (int i = 0; i < members.length; i++) {
                objOut.writeObject(members[i]);
            }

            objOut.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }








}

