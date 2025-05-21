package com.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ProductComposition {

    private Long reviewId;

    private Long productId;

    private Long recommandationId;

}
