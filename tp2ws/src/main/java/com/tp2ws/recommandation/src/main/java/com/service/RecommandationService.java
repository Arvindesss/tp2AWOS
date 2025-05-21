package com.service;

import com.model.Recommandation;

public interface RecommandationService {

    Recommandation getByProductId(Long productId);
}
