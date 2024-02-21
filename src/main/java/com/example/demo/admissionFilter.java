package com.example.demo;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter("/AadmissionFilter")
public class admissionFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
        HttpSession ss = httpRequest.getSession(false);
        boolean LoggedIn = (ss != null && ss.getAttribute("user") != null);

        if (!LoggedIn && (httpRequest.getRequestURI().endsWith("signup.jsp")||httpRequest.getRequestURI().endsWith("admission.jsp"))) {
            httpResponse.sendRedirect(httpRequest.getContextPath() + "/Login.jsp");
            return;
        }

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
