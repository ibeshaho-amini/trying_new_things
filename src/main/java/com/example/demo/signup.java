package com.example.demo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("/signup")
public class signup extends HelloServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String mail = request.getParameter("email");
        String passwd = request.getParameter("password");
        String user = request.getParameter("username");

        HttpSession ss = request.getSession();
        ss.setAttribute("maildat",mail);
        ss.setAttribute("passdat",passwd);
        ss.setAttribute("userdat",user);

        RequestDispatcher dispatche = request.getRequestDispatcher("Login.jsp");
        dispatche.forward(request,response);
    }
}
