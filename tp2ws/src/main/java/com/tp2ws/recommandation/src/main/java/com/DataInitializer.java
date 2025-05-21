package com;

import com.model.Recommandation;
import com.repository.RecommandationRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer {

    public DataInitializer(RecommandationRepository recommandationRepository) {
        recommandationRepository.saveAll(List.of(
                Recommandation.builder().recommandationId(1L).productId(1L).rate(4.5).author("Karim").content("Je recommande").build(),
                Recommandation.builder().recommandationId(2L).productId(2L).rate(0.5).author("Max").content("Je recommande pas").build()
        ));
    }
}
