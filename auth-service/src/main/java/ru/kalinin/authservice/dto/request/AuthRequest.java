package ru.kalinin.authservice.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record AuthRequest(
        @NotBlank
        @Size(min = 8, max = 16, message = "username должен быть от 8 до 16 символов")
        String username,
        @NotBlank
        @Size(min = 12, max = 16, message = "password должен быть от 12 до 16 символов")
        String password
) {
}
