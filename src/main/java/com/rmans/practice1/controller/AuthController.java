package com.rmans.practice1.controller;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody Map<String, String> credentials) {
        // Your login logic here
        String username = credentials.get("username");
        String password = credentials.get("password");

        // Generate token logic and Base64 encoding
        String token = Base64.getEncoder().encodeToString((username + ":" + password).getBytes());

        // Using HashMap instead of Map.of()
        Map<String, String> responseMap = new HashMap<>();
        responseMap.put("token", token);

        // Return response with token
        return new ResponseEntity<>(responseMap, HttpStatus.OK);
    }
}
