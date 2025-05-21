package com.client;

import com.dto.RecommandationDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name ="recommandation", url = "${recommandation.url}")
public interface RecommandationClient {

    @GetMapping("v1/recommandations/{id}")
    RecommandationDto getRecommandationById(@PathVariable("id") Long id);
}
