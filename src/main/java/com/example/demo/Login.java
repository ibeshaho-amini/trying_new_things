package com.example.demo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet( "/Login")
public class Login extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String password = request.getParameter("password");
        String email = request.getParameter("email");
//        String pswd = "123";
//        String emails = "aminibeshaho@gmail.com";

        HttpSession ss = request.getSession();
        Object psswd = ss.getAttribute("passdat");
        Object emai = ss.getAttribute("maildat");
        if(psswd.equals(password) && emai.equals(email))
        {
            HttpSession ssdata = request.getSession();
            ssdata.setAttribute("email",email);
            testServlet test= new testServlet();
            test.sendEmail(email);
            RequestDispatcher dispatcher = request.getRequestDispatcher("signup.jsp");
            dispatcher.forward(request,response);
        }
        else
        {
            request.setAttribute("result","password or username is incorrect try again");
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
        dispatcher.forward(request,response);
    }
}
