package com.repository;

import com.model.Recommandation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommandationRepository extends JpaRepository<Recommandation, Long> {

    Recommandation findByProductId(Long productId);
}
