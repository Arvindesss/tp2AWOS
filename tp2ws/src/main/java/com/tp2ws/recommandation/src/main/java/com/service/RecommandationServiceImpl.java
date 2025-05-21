package com.service;

import com.model.Recommandation;
import com.repository.RecommandationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RecommandationServiceImpl implements RecommandationService {

    private RecommandationRepository recommandationRepository;

    @Override
    public Recommandation getByProductId(Long productId) {
        return recommandationRepository.findByProductId(productId);
    }
}
