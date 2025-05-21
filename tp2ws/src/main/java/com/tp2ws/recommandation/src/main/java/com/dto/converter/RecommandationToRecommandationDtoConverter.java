package com.dto.converter;

import com.dto.RecommandationDto;
import com.model.Recommandation;

public class RecommandationToRecommandationDtoConverter {

    public static RecommandationDto convert(Recommandation recommandation) {
        return RecommandationDto.builder()
                .recommandationId(recommandation.getRecommandationId())
                .productId(recommandation.getProductId())
                .rate(recommandation.getRate())
                .author(recommandation.getAuthor())
                .content(recommandation.getContent())
                .build();
    }
}
