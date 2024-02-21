package com.example.demo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
@WebServlet( "/testServlet")
public class testServlet extends HttpServlet {
    public void sendEmail(String emailreceiver) {
        // Replace these values with your email configuration
        String host = "smtp.gmail.com";
        String username = "aibeshaho@gmail.com";
        String password = "hnkw fgkf tzkh ucvi";

        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username,password);
            }



        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailreceiver));
            message.setSubject("Login Message");
            message.setText("hello Same one has logged  into you account.Thank you .\n\n"
                    + "Best regards,\nNotification");

            Transport.send(message);

            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}

