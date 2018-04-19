package com.example;

import java.util.List;

public class PromotionMonitor {
    EmailSender emailSender;

    public PromotionMonitor(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void notifyUserAboutPromotion(List<String> usersAdresses) {
        for(String userAdress : usersAdresses) {
            try {
                emailSender.sendEmail(userAdress, "promocja!");
            } catch(IncorrectAdressException e) {
                // Obsluga wyjatku.
            } catch (Exception e) {

            }
        }
    }
}
