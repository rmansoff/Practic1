package com.rmans.config;

import java.io.IOException;

import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/*") // За бажанням, оберіть інший шлях для фільтра
public class TokenValidationFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        // Логіка перевірки токену
        String token = request.getHeader("Authorization");

        if (token == null || token.isEmpty()) {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Authorization token is missing or empty");
            return; // Якщо токен відсутній, зупиняємо обробку
        }

        // Продовжуємо ланцюг фільтрів
        filterChain.doFilter(request, response);
    }
}
