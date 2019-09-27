package com.example;

import java.time.LocalDate;

public class TestDate {
    public static void main(String[] args) {

        LocalDate a = LocalDate.now();
        LocalDate b = LocalDate.now().minusDays(5);

        int result = a.compareTo(b);

        System.out.println(result);

    }
}
