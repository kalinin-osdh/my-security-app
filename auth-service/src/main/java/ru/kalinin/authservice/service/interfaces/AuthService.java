package ru.kalinin.authservice.service.interfaces;

import org.springframework.security.core.userdetails.UserDetails;
import ru.kalinin.authservice.dto.request.AuthRequest;
import ru.kalinin.authservice.dto.request.RefreshRequest;
import ru.kalinin.authservice.dto.response.AuthResponse;

public interface AuthService {
    public AuthResponse register(AuthRequest authRequest);
    public AuthResponse login(AuthRequest authRequest);
    public void logout(UserDetails userDetails);
    public AuthResponse refresh(RefreshRequest refreshRequest);
}
