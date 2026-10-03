package ru.kalinin.productservice.dto.response;

import ru.kalinin.productservice.entity.enums.ProductType;

public record ProductResponse(
        String title,
        String description,
        ProductType productType
) {
}
