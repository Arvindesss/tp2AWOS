package com.service.impl;

import com.client.ProductClient;
import com.client.RecommandationClient;
import com.client.ReviewClient;
import com.dto.ProductComposition;
import com.dto.ProductDto;
import com.dto.RecommandationDto;
import com.dto.ReviewDto;
import com.service.ProductCompositionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class ProductCompositionServiceImpl implements ProductCompositionService {

    private ProductClient productClient;

    private ReviewClient reviewClient;

    private RecommandationClient recommandationClient;

    @Override
    public ProductComposition getProductComposition(Long productId) {
        // recuperer un produit
        ProductDto productDto = productClient.getProductById(productId);
        // recuperer une review
        ReviewDto reviewDto = reviewClient.getReviewByProductId(productId);
        // recuperer une recommandation
        RecommandationDto recommandationDto = recommandationClient.getRecommandationById(productId);
        // construire un product composition et la renvoyer
       return ProductComposition.builder()
               .productId(productDto.getId())
               .recommandationId(reviewDto.getId())
               .recommandationId(recommandationDto.getRecommandationId())
               .build();
    }
}
