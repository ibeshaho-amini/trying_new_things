package com.example.demo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.Properties;

@WebServlet( "/admisionemail")
public class admisionemail extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fname = request.getParameter("First_Name");
        String email = request.getParameter("email");

        sendEmail(email,fname);

        RequestDispatcher dispatcher = request.getRequestDispatcher("admission.jsp");
        dispatcher.forward(request, response);

    }
    public void sendEmail(String emailreceiver, String full) {
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
            message.setSubject("Applying for Admission Message");
            message.setText("Dear "+ full + " \n\n " +
                    "Thank you for Applying for Student Admission we will let you know if you are admitted .\n\n"
                    + "Best regards,\nNotification");

            Transport.send(message);

            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
