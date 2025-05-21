package com;

import com.model.Review;
import com.repository.ReviewRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer {

    public DataInitializer(ReviewRepository reviewRepository) {
        reviewRepository.saveAll(List.of(
                Review.builder().id(1L).productId(1L).subject("Objets").content("Nul").author("Max").build(),
                Review.builder().id(2L).productId(2L).subject("Objets 2").content("Nul mais bien").author("Max").build()
        ));
    }
}
