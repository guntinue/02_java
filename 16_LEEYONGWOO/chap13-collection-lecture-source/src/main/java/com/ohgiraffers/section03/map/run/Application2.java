package com.ohgiraffers.section03.map.run;

import java.io.*;
import java.util.Properties;

public class Application2 {
    private static final String DRIVER_DAT_PATH = "src/main/java/com/ohgiraffers/section03/map/run/driver.dat";
    private static final String DRIVER_PROPERTIES_PATH = "src/main/java/com/ohgiraffers/section03/map/run/driver.properties";
    private static final String DRIVER_XML_PATH = "src/main/java/com/ohgiraffers/section03/map/run/driver.xml";

    public static void main(String[] args) {
        /**
         * Properties
         * HashMap과 거의 유사하지만 Key와 value 모두를 String으로만 사용할 수 있는 자료구조이다.
         * 설정파일의 값을 읽어서 애플리케이션에 적용할 때 사용
         *
         */

        /*데이터베이스의 접속 정보를 가지고 있는 객체*/
        Properties prop=new Properties();
        prop.setProperty("driver","com.mysql.jdbc.Driver");
        prop.setProperty("url","jdbc:mysql://localhost:3306/test");
        prop.setProperty("user","student");
        prop.setProperty("password","student");

        System.out.println(prop);

        try {
            prop.store(new FileOutputStream("src/main/java/com/ohgiraffers/section03/map/run/driver.dat"),
                    "jdbc driver(comment)");
            prop.store(new FileOutputStream("src/main/java/com/ohgiraffers/section03/map/run/driver.xml")
            , "jdbc driver(comment-xml)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("=======================================");
        // ... existing code ...

            Properties loadedProperties = new Properties();
            System.out.println("prop2 : " + loadedProperties);

            loadPropertiesFromFiles(loadedProperties);

            System.out.println("prop2 = " + loadedProperties);
// ... existing code ...
        }

        private static void loadPropertiesFromFiles (Properties properties){
            try {
                properties.load(new FileInputStream(DRIVER_DAT_PATH));
                properties.load(new FileReader(DRIVER_PROPERTIES_PATH));
                properties.loadFromXML(new FileInputStream(DRIVER_XML_PATH));
            } catch (IOException e) {
                throw new RuntimeException("Failed to load properties from configuration files", e);
            }
        }
// ... existing code ...



}
