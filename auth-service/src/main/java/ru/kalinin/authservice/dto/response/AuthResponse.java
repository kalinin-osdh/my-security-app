package ru.kalinin.authservice.dto.response;

public record AuthResponse(
        String username,
        String accessToken,
        String refreshToken
) {
}
