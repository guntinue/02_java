package com.E.section02.enumtype;

import java.time.LocalDateTime;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class Application2 {
    public static void main(String[] args) {
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());

        BooleanSupplier booleanSupplier = () -> {
            int random = (int)(Math.random() * 2);
            return random == 0? false : true;
        };
        System.out.println("랜덤 true or false: " +booleanSupplier.getAsBoolean());
    }

}
