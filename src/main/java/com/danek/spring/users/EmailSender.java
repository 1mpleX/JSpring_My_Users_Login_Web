package com.danek.spring.users;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailSender {

    public static int userCode;
    public static String userEmail;
    public static void sendCode() {
        String host = "smtp.gmail.com";
        final String user = "danya43532@gmail.com";
        final String password = "nfsv vllw dvys whsh";

        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(user, password);
                    }
                });
        try {
            int minValue = 1;
            int maxValue = 16000;
            userCode = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(userEmail));
            message.setSubject("Your code for registration");
            message.setText("your code is - " + userCode);

            Transport.send(message);

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
