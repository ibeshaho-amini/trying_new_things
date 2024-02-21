package com.example.demo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/Admission")
public class Admission extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("fname", request.getParameter("First_Name"));
        request.setAttribute("lname", request.getParameter("Last_Name"));
        request.setAttribute("email", request.getParameter("email"));
        request.setAttribute("pass", request.getParameter("password"));
        request.setAttribute("phone", request.getParameter("phone"));
        request.setAttribute("address", request.getParameter("address"));
        request.setAttribute("city", request.getParameter("city"));
        request.setAttribute("state", request.getParameter("state"));

        RequestDispatcher dispatcher = request.getRequestDispatcher("admisionemail");
        dispatcher.forward(request,response);
    }
}
