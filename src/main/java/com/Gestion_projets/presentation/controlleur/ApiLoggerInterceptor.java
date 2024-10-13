package com.Gestion_projets.presentation.controlleur;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.io.IOException;
import java.util.Enumeration;

@Component
public class ApiLoggerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        // Log the request information
        System.out.println("Request URL: " + request.getRequestURL());
        System.out.println("HTTP Method: " + request.getMethod());
        System.out.println("Headers:");
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            System.out.println(headerName + ": " + request.getHeader(headerName));
        }

        // Log additional request details if needed, like request body

        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        // Log the response information
        System.out.println("Response Status: " + response.getStatus());
    }
}