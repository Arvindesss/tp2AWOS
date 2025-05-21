package com.controller;

import com.dto.ProductComposition;
import com.service.ProductCompositionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-compositions")
public class ProductCompositionController {

    private ProductCompositionService productService;


    @GetMapping("/product/{id}")
    public ResponseEntity<ProductComposition> getProductAggregateByProductId(@PathVariable Long id) {
        return productService.getProductComposition(id);
    }


}
