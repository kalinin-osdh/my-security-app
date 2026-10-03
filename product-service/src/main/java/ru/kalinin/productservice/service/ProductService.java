package ru.kalinin.productservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kalinin.productservice.dto.mapper.ProductMapper;
import ru.kalinin.productservice.dto.request.ProductRequest;
import ru.kalinin.productservice.dto.response.ProductResponse;
import ru.kalinin.productservice.repository.ProductRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public List<ProductResponse> getAllProducts() {
        return productMapper.toResponse(
                productRepository.findAll()
        );
    }

    public ProductResponse getProductById(Long id) {
        return productMapper.toResponse(
                productRepository.findById(id).get()
        );
    }

    public ProductResponse save(ProductRequest request) {
        return productMapper.toResponse(
                productRepository.save(productMapper.toEntity(request))
        );
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
