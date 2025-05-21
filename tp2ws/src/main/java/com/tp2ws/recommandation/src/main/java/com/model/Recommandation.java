package com.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;



@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Recommandation {

    @Id
    private Long productId;

    private Long recommandationId;

    private String author;

    private Double rate;

    private String content;
}
