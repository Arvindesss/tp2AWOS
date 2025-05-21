package com;


import com.model.Product;
import com.repository.ProductRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer {

    public DataInitializer(ProductRepository productRepository) {
        productRepository.saveAll(List.of(
                Product.builder().id(1L).name("Verre").weight(10D).build(),
                Product.builder().id(2L).name("Verre 2").weight(100D).build()
        ));
    }
}
