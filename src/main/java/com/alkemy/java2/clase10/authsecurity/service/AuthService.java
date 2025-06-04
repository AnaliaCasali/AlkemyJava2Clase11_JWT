package com.alkemy.java2.clase10.authsecurity.service;


import com.alkemy.java2.clase10.authsecurity.dto.AuthRequest;
import com.alkemy.java2.clase10.authsecurity.dto.AuthResponse;
import com.alkemy.java2.clase10.dto.UserDTO;

public interface AuthService {
    AuthResponse register(UserDTO request);
    AuthResponse authenticate(AuthRequest request);
}