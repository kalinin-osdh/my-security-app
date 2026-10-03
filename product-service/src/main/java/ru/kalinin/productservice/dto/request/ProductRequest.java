package ru.kalinin.productservice.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import ru.kalinin.productservice.entity.enums.ProductType;

public record ProductRequest(
        @NotBlank
        @Size(min = 1, max = 50)
        String title,
        String description,
        @NotNull
        ProductType productType
) {
}
