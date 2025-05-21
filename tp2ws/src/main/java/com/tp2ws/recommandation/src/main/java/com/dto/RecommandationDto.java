package com.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RecommandationDto {

    private Long productId;

    private Long recommandationId;

    private String author;

    private Double rate;

    private String content;
}
