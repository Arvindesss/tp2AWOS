package com.client;


import com.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name ="product", url = "${product.url}")
public interface ProductClient {

    @GetMapping("v1/products/{id}")
    ProductDto getProductById(@PathVariable("id") Long id);
}
