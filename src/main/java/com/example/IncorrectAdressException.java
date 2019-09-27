package com.example;

public class IncorrectAdressException extends Exception {
    String incorrectAdress;

    public IncorrectAdressException(String incorrectAdress) {
        super();
        this.incorrectAdress = incorrectAdress;
    }
}
