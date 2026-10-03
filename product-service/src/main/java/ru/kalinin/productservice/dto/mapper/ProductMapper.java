package ru.kalinin.productservice.dto.mapper;

import org.springframework.stereotype.Component;
import ru.kalinin.productservice.dto.request.ProductRequest;
import ru.kalinin.productservice.dto.response.ProductResponse;
import ru.kalinin.productservice.entity.Product;

import java.util.List;

@Component
public class ProductMapper {

    public Product toEntity(ProductRequest productRequest) {
        Product product = new Product();
        product.setTitle(productRequest.title());
        product.setDescription(productRequest.description());
        product.setProductType(productRequest.productType());
        return product;
    }

    public ProductResponse toResponse(Product product) {
        return new ProductResponse(
                product.getTitle(),
                product.getDescription(),
                product.getProductType());
    }

    public List<ProductResponse> toResponse(List<Product> products) {
        if (products.isEmpty())
            return List.of();
        return products.stream().map(this::toResponse).toList();
    }
}
