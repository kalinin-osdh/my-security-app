package ru.kalinin.authservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kalinin.authservice.dto.request.AuthRequest;
import ru.kalinin.authservice.dto.request.RefreshRequest;
import ru.kalinin.authservice.dto.response.AuthResponse;
import ru.kalinin.authservice.repository.UserRepository;
import ru.kalinin.authservice.service.interfaces.AuthService;

@Service
@Transactional
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;

    @Override
    public AuthResponse register(AuthRequest authRequest) {
        return null;
    }

    @Override
    public AuthResponse login(AuthRequest authRequest) {
        return null;
    }

    @Override
    public void logout(UserDetails userDetails) {

    }

    @Override
    public AuthResponse refresh(RefreshRequest refreshRequest) {
        return null;
    }
}
