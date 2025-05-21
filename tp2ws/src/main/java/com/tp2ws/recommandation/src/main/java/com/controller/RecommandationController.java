package com.controller;

import com.dto.RecommandationDto;
import com.dto.converter.RecommandationToRecommandationDtoConverter;
import com.model.Recommandation;
import com.service.RecommandationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("v1/recommandations")
@AllArgsConstructor
public class RecommandationController {

    private RecommandationService recommandationService;

    @GetMapping("/product/{productId}")
    public ResponseEntity<RecommandationDto> getRecommandationByProductId(@PathVariable Long productId){
        Recommandation recommandation = recommandationService.getByProductId(productId);
        return ResponseEntity.ok(RecommandationToRecommandationDtoConverter.convert(recommandation));
    }
}

