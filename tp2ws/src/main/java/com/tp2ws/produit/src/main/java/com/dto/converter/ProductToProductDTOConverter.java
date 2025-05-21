package com.dto.converter;

import com.dto.ProductDto;
import com.model.Product;

public class ProductToProductDTOConverter {

    public static ProductDto convert(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .weight(product.getWeight())
                .build();
    }
}
