package com.E.section03.map.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) throws IOException {
        /*Properties
        * 설정파일의 값을 읽어서 애플리케이션에 적용 할 때 많이 사용함
        * HashMap과 유사하지만 key, value 모두 String 만 사용할 수 있다*/

        /*데이터베이스의 접속 정보를 가지고 있는 객체*/
        Properties p =  new Properties();
        p.setProperty("driver", "com.driver");
        p.setProperty("url", "https://localhost:8080/");
        p.setProperty("user", "student");
        p.setProperty("password", "student");

        try {
            p.store(new FileOutputStream("src/main/java/com/E/section03/map/run/driver.dat"),
                    "jdbc driver");
            p.storeToXML(new FileOutputStream("src/main/java/com/E/section03/map/run/driver.dat"), "comments");
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }   catch (IOException e) {
            throw new RuntimeException(e);
        }

        Properties prop = new Properties();

        try {
            prop.load(new FileInputStream("src/main/java/com/E/section03/map/run/driver.dat"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        };
        System.out.println(prop);

    //Properties의 객체에 값을 추가할 경우에는 setProperty(), 가져올때는 getProperty()
        System.out.println(p.getProperty("driver"));

    }

}
