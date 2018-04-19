package com.example;

public class EmailSender {
    public void sendEmail(String adress, String messageText) throws IncorrectAdressException {
        if(adress == null) {
            throw new NullPointerException();
        }
        if(adress == "") {
            throw new IncorrectAdressException(adress);
        }

        // Rest of the function.
    }
}
